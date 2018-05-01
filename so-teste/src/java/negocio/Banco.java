package negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lavinia
 */
public class Banco {
    public static Connection con;
    
    public static Connection getConnection () throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbteste", "root", "5233");
        }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    
    public static void closeCon(java.sql.Connection con, ResultSet rs, Statement st) {
        if(rs != null) {
            try{
                rs.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        if(st != null){
            try{
                st.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }

        }

        if(con != null){
            try{ 
                con.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }

    }
}
