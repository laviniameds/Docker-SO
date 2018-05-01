/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;

/**
 *
 * @author lavinia
 */
public class UsuariosNegocio {
    public ArrayList<Usuario> getUsuarios(){
        UsuarioDAO uDAO = new UsuarioDAO();
        ArrayList<Usuario> lista = new ArrayList<>();
        
        try {
            lista = uDAO.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
