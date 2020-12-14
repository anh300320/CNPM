package com.example.cnpm.main;


import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class DAO {
    private ConnectionImpl connection;
    private StatementImpl statement;
    private ResultSet resultSet;

    private String hostname = "localhost";
    private String username = "root";
    private String password = "";
    private String dbName = "mysql_db";
    private String connectionUrl = "jdbc:mysql://" + hostname + ":3306/" + dbName;

    private static final String SQL_GET_ALL ="SELECT * FROM %s";
    private static final String SQL_INSERT = "INSERT INTO %s VALUES %s";

    public DAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (ConnectionImpl) DriverManager.getConnection(connectionUrl, username, password);
            //connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/nhavanhoa","root","");
            statement = (StatementImpl) connection.createStatement();
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
    }

    public DAO(String address){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (ConnectionImpl) DriverManager.getConnection(address);
            statement = (StatementImpl) connection.createStatement();
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
    }

    public ResultSet query(String tableName) throws SQLException {
        return statement.executeQuery(SQL_GET_ALL + tableName);
    }

    public int update(String sql) throws SQLException {
        return statement.executeUpdate(sql);
    }

    public <T> boolean create(String tableName, Object obj, Class<T> objType) {
        String record = toRecord(obj, objType);

        try {
            statement.executeUpdate(String.format(SQL_INSERT, tableName, record));
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private <T> String toRecord(Object obj, Class<T> objType) {
        StringBuilder record = new StringBuilder();
        record.append("(");
        Method[] methods = objType.getMethods();

        for(Method method : methods){
            String methodName = method.getName();

            if(isGetMethod(methodName)){
                String returnType = method.getReturnType().getSimpleName();

                try {
                    switch (returnType){
                        case "int":
                            record.append(method.invoke(obj) + ",");
                            break;
                        case "String":
                            record.append("'" + method.invoke(obj) + "'" +",");
                            break;
                    }

                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        record.deleteCharAt(record.length() - 1);
        record.append(")");

        return record.toString();
    }

    private boolean isGetMethod(String method){
        if(method.equals("getClass")) return false;
        Pattern pattern = Pattern.compile("get+");
        Matcher matcher = pattern.matcher(method);

        return matcher.find();
    }

    public <T> List<T> getAll(String tableName, Class<T> objType){

        List<T> result = new ArrayList<T>();

        try {
            ResultSet rs = statement.executeQuery(String.format(SQL_GET_ALL, tableName));
            while(rs.next()) {
                Constructor<T> defaultConstructor = objType.getConstructor();
                T obj = defaultConstructor.newInstance();
                List<Method> getMethods = getGetMethods(objType);
                for(Method getMethod : getMethods) {
                    setValue(obj, getMethod, rs);
                }
                result.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return result;
    }

    private <T> List<Method> getGetMethods(Class<T> objType) {
        Method[] methods = objType.getMethods();
        List<Method> result = new ArrayList<Method>();

        for(Method method : methods) {
            if(isGetMethod(method.getName())) {
                result.add(method);
            }
        }
        return result;
    }

    private <T> void setValue(T obj, Method getMethod, ResultSet rs) {
        String type = getMethod.getReturnType().getSimpleName();
        Method setMethod = null;
        try {
            if(type.equals("int")) {
                String setMethodName = toSetMethod(getMethod.getName());
                setMethod  = obj.getClass().getDeclaredMethod(toSetMethod(getMethod.getName()), int.class);
                int value = rs.getInt(getField(getMethod.getName()));
                setMethod.invoke(obj, value);
            } else {
                setMethod  = obj.getClass().getDeclaredMethod(toSetMethod(getMethod.getName()), String.class);
                String value = rs.getString(getField(getMethod.getName()));
                setMethod.invoke(obj, value);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private String toSetMethod(String getMethod) {
        String result = getMethod.replaceFirst("g", "s");
        return result;
    }

    private String getField(String getMethod) {
        String result = getMethod.replaceFirst("get", "");
        return result;
    }

    public String getColumn(String columnName) {
        try {
            return resultSet.getString(columnName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

