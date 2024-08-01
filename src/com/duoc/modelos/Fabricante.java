
package com.duoc.modelos;

public class Fabricante {
    
    private int id;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(int id, String nombre) throws CustomException {
        this.id = id;
        this.setNombre(nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CustomException {
        if(nombre.isEmpty() || nombre.trim().length()==0)
        {
            throw new CustomException("el largo del fabricante debe tener al menos un caracter");
        }
        else if(nombre.trim().length()>100)
        {
            throw new CustomException("el nombre excede el maximo");
        }
        else
        {
        this.nombre = nombre;
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
