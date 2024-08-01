package com.duoc.controlador;

import com.duoc.conexion.Conexion;
import java.util.ArrayList;
import com.duoc.modelos.Fabricante;
import com.duoc.modelos.CustomException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricanteControlador implements iControlador<Fabricante>{
    
    //Definir las consultas SQL para el mantenedor
    private static final String SQL_INSERT = "INSERT INTO FABRICANTE (ID, NOMBRE) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE FABRICANTE SET NOMBRE = ? WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM FABRICANTE WHERE ID = ?";
    private static final String SQL_READ = "SELECT * FROM FABRICANTE WHERE ID = ?";
    private static final String SQL_READALL = "SELECT * FROM  FABRICANTE ORDER BY ID";
    
    //Definar el objeto Conexion para la conexión con la Base de Datos
    private static final Conexion CONEXION = Conexion.obtenerEstadoConexion();
    
    //Definir un objeto PreparedStatement para poder armar y ejecutar las consultas.
    private PreparedStatement ps;
    
    //Definir un objeto que nos permita obtener los datos que devolverá una consulta del tipo SELECT
    private ResultSet rs;

    @Override
    public boolean create(Fabricante t) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, t.getId());
            ps.setString(2, t.getNombre());
            if(ps.executeUpdate() > 0)
            {
                return true;
            }            
        }
        catch(SQLException ex)
        {
            return false;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return false;
    }

    @Override
    public Fabricante read(Object key) {
        Fabricante f = null;
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, (int)key);
            rs = ps.executeQuery();
            if(rs.next())
            {
                f = new Fabricante(rs.getInt(1), rs.getString(2));
            }
        }
        catch(SQLException ex)
        {
            return null;
        } 
        catch (CustomException ex) 
        {
            Logger.getLogger(FabricanteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return f;   
    }

    @Override
    public boolean update(Fabricante t) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getId());            
            if(ps.executeUpdate() > 0)
            {
                return true;
            }            
        }
        catch(SQLException ex)
        {
            return false;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, (int)key);
            if(ps.executeUpdate() > 0)
            {
                return true;
            }            
        }
        catch(SQLException ex)
        {
            return false;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return false;
    }

    @Override
    public ArrayList<Fabricante> readAll() {
        ArrayList<Fabricante> fabricantes = new ArrayList();
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next())
            {
                fabricantes.add(new Fabricante(rs.getInt(1), rs.getString(2)));
            }
        }
        catch(SQLException ex)
        {
            return null;
        } 
        catch (CustomException ex) 
        {
            Logger.getLogger(FabricanteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return fabricantes; 
    }
    
}
