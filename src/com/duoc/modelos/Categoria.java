/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.modelos;

/**
 *
 * @author mizam
 */
public class Categoria {
    
    private int id ;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int id, String descripcion)throws CustomException  {
        this.id = id;
        this.setDescripcion(descripcion);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws CustomException{
        if(descripcion.isEmpty() || descripcion.trim().length() == 0)
        {
            throw new CustomException("debes ingresar una descripcion valida");
        }
        else if(descripcion.trim().length()>50)
        {
            throw new CustomException("la descripcion excede el maximo de caracteres");
        }
        else
        {
            this.descripcion = descripcion;
        }
    }

    @Override
    public String toString() {
        return descripcion ;
    }
    
    
    
}
