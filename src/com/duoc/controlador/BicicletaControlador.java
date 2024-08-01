package com.duoc.controlador;

import com.duoc.conexion.Conexion;
import com.duoc.modelos.CustomException;
import java.util.ArrayList;
import com.duoc.modelos.Bicicleta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BicicletaControlador implements iControlador<Bicicleta>{
    
    //Definir las consultas SQL para el mantenedor
    private static final String SQL_INSERT = "INSERT INTO BICICLETA (ID, MODELO, FABRICANTE, CATEGORIA, TALLA, SUSPENSION , TRANSMISION , FRENOS , STOCK , VALOR) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE BICICLETA SET  MODELO = ? , FABRICANTE = ?, CATEGORIA = ?, TALLA = ?, SUSPENSION = ? , TRANSMISION = ? , FRENOS = ? , STOCK = ? , VALOR = ? WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM BICICLETA WHERE ID = ?";
    private static final String SQL_READ = "SELECT * FROM BICICLETA WHERE ID = ?";
    private static final String SQL_READALL = "SELECT * FROM BICICLETA ORDER BY MODELO";
    
    //Definar el objeto Conexion para la conexión con la Base de Datos
    private static final Conexion CONEXION = Conexion.obtenerEstadoConexion();
    
    //Definir un objeto PreparedStatement para poder armar y ejecutar las consultas.
    private PreparedStatement ps;
    
    //Definir un objeto que nos permita obtener los datos que devolverá una consulta del tipo SELECT
    private ResultSet rs;

    @Override
    public boolean create(Bicicleta t) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, t.getId());
            ps.setString(2, t.getModelo());
            ps.setInt(3, t.getFabricante());
            ps.setInt(4, t.getCategoria());
            ps.setString(5, t.getTalla());
            ps.setString(6, t.getSuspension());
            ps.setString(7, t.getTrasmision());
            ps.setString(8, t.getFrenos());
            ps.setInt(9, t.getStock());
            ps.setInt(10, t.getValor());
            
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
    public Bicicleta read(Object key) {
        Bicicleta p = null;
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, (int)key);
            rs = ps.executeQuery();
            if(rs.next())
            {
                p = new Bicicleta(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9),rs.getInt(10));
            }
        }
        catch(SQLException ex)
        {
            return null;
        } 
        catch (CustomException ex) 
        {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return p;   
    }

    @Override
    public boolean update(Bicicleta t) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_UPDATE);            
            
            ps.setString(1, t.getModelo());
            ps.setInt(2, t.getFabricante());
            ps.setInt(3, t.getCategoria());
            ps.setString(4, t.getTalla());
            ps.setString(5, t.getSuspension());
            ps.setString(6, t.getTrasmision());
            ps.setString(7, t.getFrenos());
            ps.setInt(8, t.getStock());
            ps.setInt(9, t.getValor());
            ps.setInt(10, t.getId());
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
    public ArrayList<Bicicleta> readAll() {
        ArrayList<Bicicleta> bicicletas = new ArrayList();
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next())
            {
                bicicletas.add(new Bicicleta(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9),rs.getInt(10)));
            }
        }
        catch(SQLException ex)
        {
            return null;
        } 
        catch (CustomException ex) 
        {
            Logger.getLogger(BicicletaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
        return bicicletas;
    }
    
}