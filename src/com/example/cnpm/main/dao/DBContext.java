/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangkysd;



import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import model.NguoiDangKi;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DBContext {
        
    public static ArrayList<NguoiDangKi> selectQuery(){
        String dbURL = "jdbc:mysql://localhost/cnpm_sql";
        String username = "root";
        String password = "";
        ArrayList<NguoiDangKi> list = new ArrayList<>();
        String sql = "select ttcn.hoten, ttcn.diachi,ttcn.sdt,ttcn.cmnd,lshd.tg_batdau, lshd.tg_ketthuc,lsbg.phi,lshd.mucdich,lshd.tenhd "
                + "   from tt_canhan ttcn, thue_nhavanhoa nvh, lshoatdong lshd,lsbangiao lsbg "
                + "   where ttcn.cmnd=nvh.cmnd and lshd.mathue=nvh.mathue and ttcn.cmnd=lsbg.cmnd";
  //       String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DKsudung;user=sa;password=123456";
        try {
           Connection connection =   DriverManager.getConnection(dbURL,username,password);
          Statement  statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                NguoiDangKi n = new NguoiDangKi();
                n.setName(rs.getString(1));
                n.setAddress(rs.getString(2));
                n.setPhoneNumber(rs.getString(3));
                n.setCMND(rs.getString(4));
                n.setTimeUse(rs.getDate(5));
                n.setTimeEnd(rs.getDate(6));
                n.setPhi(rs.getInt(7));
                n.setMucdich(rs.getString(8));
                n.setBienban(rs.getString(9));
                list.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
   
 public  boolean addNewMem(NguoiDangKi n){
  
      PreparedStatement statement ;
     String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DKsudung;user=sa;password=123456";
     try {
        Connection connection = DriverManager.getConnection(connectionUrl);
         String sql = "INSERT INTO DKsuDung(HoTen,DiaChi,SDT,CMND,TGsd,Hansd,Phisd,Mucdich,Bienban) VALUES(?,?,?,?,?,?,?,?,?)";
         statement=connection.prepareStatement(sql);
          statement.setString(1,n.getName());
         statement.setString(2, n.getAddress());
          statement.setString(3, n.getPhoneNumber());
          statement.setString(4, n.getCMND());
         statement.setTimestamp(5, new Timestamp(n.getTimeUse().getTime()));
         statement.setTimestamp(6, new Timestamp(n.getTimeEnd().getTime()));
          statement.setInt(7, n.getPhi());
          statement.setString(8, n.getMucdich());
          statement.setString(9, n.getBienban());
          statement.executeUpdate();
          return true;
     } catch (Exception e) {
         e.printStackTrace();
     }
   return false;
 }
 
   
 
   public  static void delete(String cmnd){
  
      PreparedStatement statement ;
     String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DKsudung;user=sa;password=123456";
     try {
        Connection connection = DriverManager.getConnection(connectionUrl);
         String sql = "delete from DKsuDung where CMND= ?";
         statement=connection.prepareCall(sql);
          statement.setString(1,cmnd);
           statement.executeUpdate();  
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
    public static ArrayList<NguoiDangKi> findByname(String HoTen){
       
        ArrayList<NguoiDangKi> list = new ArrayList<>();
        String sql = "SELECT * FROM DKsuDung where HoTen like ?";
         String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DKsudung;user=sa;password=123456";
        try {
           Connection connection =   DriverManager.getConnection(connectionUrl);
          PreparedStatement statement = connection.prepareCall(sql);
          statement.setString(1, "%"+HoTen+"%");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                NguoiDangKi n = new NguoiDangKi(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getDate(5),
                rs.getDate(6),
                rs.getInt(7),
                rs.getString(8),
                rs.getString(9));
                list.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
 

