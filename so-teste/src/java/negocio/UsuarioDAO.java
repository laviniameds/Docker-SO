package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lavinia
 */
public class UsuarioDAO {
    
    public ArrayList<Usuario> listar() throws SQLException{
        Connection conn = Banco.getConnection();
        ResultSet rs = null;
        Statement st = null;
        ArrayList<Usuario> lista = null;
        String sql = "SELECT * FROM usuario";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            if(rs.next()){
                Usuario u = new Usuario();
                
                u.setNome(rs.getString("nome"));
                u.setFoto(rs.getString("foto"));
                u.setEmail(rs.getString("email"));
                
                lista.add(u);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Banco.closeCon(conn, rs, st);
        }
        return null;
    }   
}
