package uts.Databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Database {
    private static Connection con;
    private static Statement st;
    private static PreparedStatement stmt ;
    private static ResultSet rs,uwu;
    private static String [][] adminAcc = {{"awd","awd"},{"qq","qq"}};

    public Database() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo","root","");
            st = con.createStatement();
            System.out.println("berhasil");
        } catch (SQLException e) {
            System.out.println("gagal nyambung karena : "+e);
            
        }  
        
    }
    
    public ResultSet executeSelectQuery(String query) throws SQLException{
        this.rs = st.executeQuery(query);
        return rs;
    }
    
    public void executeUpdateQuery(String query) throws SQLException{
        this.st.execute(query);
    }
    
    public static String[][] getAdminAcc() {
        return adminAcc;
    }

    public static void setAdminAcc(String[][] adminAcc) {
        Database.adminAcc = adminAcc;
    }
    
   
    
//    protected static void display(String qq) throws SQLException{
//        uwu = executeSelectUpdateQuery(qq, "11");
//        while (uwu.next()) {
//                String id = uwu.getString(1);
//                String nama = uwu.getString(2);
//                String alamat = uwu.getString(3);
//                String Hp = uwu.getString(4);
//                String bonus = uwu.getString(5);
//
//
//                System.out.println(id + " " + nama + " " + alamat + " " + Hp + " " + bonus);
//                System.out.println(Hp.getClass().getSimpleName());
//
//            }
//    }
//    
//    public static void main(String[] args) throws SQLException {
//        new uts.Databases.Database();
//        String qq = "SELECT * FROM databarang WHERE ID_Barang = '?'";
//        display(qq);
//        
//    }
}