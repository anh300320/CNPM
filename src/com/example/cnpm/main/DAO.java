package com.example.cnpm.main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class DAO {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	
	private String hostname = "localhost";
    private String username = "root";
    private String password = "";
    private String dbName = "mysql_db";
    private String connectionUrl = "jdbc:mysql://" + hostname + ":3306/" + dbName;
	
	public DAO(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(connectionUrl, username, password);
			//connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/nhavanhoa","root","");
			statement = (Statement) connection.createStatement();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public DAO(String address){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(address);
			statement = (Statement) connection.createStatement();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void SQL(String sql){
		SQLException e1 = null,e2 = null;
		int count = 0;
		try {
			resultSet = statement.executeQuery(sql);
			//JOptionPane.showMessageDialog(null, "        Querry Excuted!");
		} catch (SQLException e) {
			count++;
			e1 = e;
			
		} finally {
			try {
				statement.executeUpdate(sql);
				//JOptionPane.showMessageDialog(null, "        Querry Excuted!");
			} catch (SQLException e) {
				count++;
				e2 = e;
			}
		}
		if (count == 2) {
			//JOptionPane.showMessageDialog(null, "      Some Error Occured!");
			e1.printStackTrace();
			e2.printStackTrace();
		}
			
	}
	
	public boolean next() {
		try {
			return (resultSet.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
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
