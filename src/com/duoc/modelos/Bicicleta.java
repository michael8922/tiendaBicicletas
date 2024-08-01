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
public class Bicicleta {
    
    private int id;
    private String modelo;
    private int fabricante;
    private int categoria;
    private String talla;
    private String suspension;
    private String trasmision;
    private String frenos;
    private int stock;
    private int valor;

    public Bicicleta() {
    }

    public Bicicleta(int id, String modelo, int fabricante, int categoria, String talla, String suspension, String trasmision, String frenos, int stock, int valor) throws CustomException {
        this.id = id;
        this.setModelo(modelo);
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.setTalla(talla);
        this.setSuspension(suspension);
        this.setTrasmision(trasmision);
        this.setFrenos(frenos);
        this.stock = stock;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws CustomException {
        if(modelo.isEmpty()|| modelo.trim().length()==0)
        {
            throw new CustomException("el largo del modelo debe tener al menos un caracter");
        }
        else if(modelo.trim().length()>100)
        {
            throw new CustomException("la descripcion excede el maximo de caracteres");
        }
        else
        {
        this.modelo = modelo;
        }
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) throws CustomException {
        if(talla.isEmpty()|| talla.trim().length()==0)
        {
            throw new CustomException("el largo de  talla debe tener al menos un caracter");
        }
        else if(talla.trim().length()>5)
        {
            throw new CustomException("el largo de  talla excede el maximo de caracteres");
        }
        else
        {
        this.talla = talla;
        }
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) throws CustomException {
        if(suspension.isEmpty()|| suspension.trim().length()==0)
        {
            throw new CustomException("el largo de suspension debe tener al menos un caracter");
        }
        else if(suspension.trim().length()>30)
        {
            throw new CustomException("el largo de suspension excede el maximo de caracteres");
        }
        else
        {
            this.suspension = suspension;
        }
    }

    public String getTrasmision() {
        return trasmision;
    }

    public void setTrasmision(String trasmision) throws CustomException {
        if(trasmision.isEmpty()|| trasmision.trim().length()==0)
        {
            throw new CustomException("el largo de  trasmision debe tener al menos un caracter");
        }
        else if(trasmision.trim().length()>30)
        {
            throw new CustomException("el largo de trasmision excede el maximo de caracteres");
        }
        else
        {
        this.trasmision = trasmision;
        }
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) throws CustomException {
        if(frenos.isEmpty()|| frenos.trim().length()==0)
        {
            throw new CustomException("el largo de frenos debe tener al menos un caracter");
        }
        else if(frenos.trim().length()>30)
        {
            throw new CustomException("el largo de frenos excede el maximo de caracteres");
        }
        else
        {
        this.frenos = frenos;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
