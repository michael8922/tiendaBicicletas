
package com.duoc.controlador;


import com.duoc.conexion.Conexion;
import com.duoc.modelos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UsuarioControlador implements iControlador<Usuario>{
    
     
    //Definir las consultas SQL para el mantenedor
    private static final String SQL_INSERT = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_DELETE = "";
    private static final String SQL_READ = "SELECT * FROM USUARIO WHERE USERNAME = ?";
    private static final String SQL_READALL = "SELECT * FROM BICICLETA ORDER BY MODELO";
    
    //Definar el objeto Conexion para la conexión con la Base de Datos
    private static final Conexion CONEXION = Conexion.obtenerEstadoConexion();
    
    //Definir un objeto PreparedStatement para poder armar y ejecutar las consultas.
    private PreparedStatement ps;
    
    //Definir un objeto que nos permita obtener los datos que devolverá una consulta del tipo SELECT
    private ResultSet rs;

    @Override
    public boolean create(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario read(Object key) {
        Usuario u = null;
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_READ);
            ps.setString(1, String.valueOf(key));
            rs = ps.executeQuery();
            if(rs.next())
            {
                u = new Usuario(rs.getString(1), rs.getString(2), rs.getInt(3));
            }
        }
        catch(SQLException ex)
        {
            return null;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return u;
   }

    @Override
    public boolean update(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
