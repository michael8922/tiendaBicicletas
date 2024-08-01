/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.controlador;

import java.util.ArrayList;

/**
 *
 * @author mizam
 */
public interface iControlador<T> {
       //Definir el nombre de los métodos que serán usados para el CRUD
    public boolean create(T t);
    public T read(Object key);
    public boolean update(T t);
    public boolean delete(Object key);
    public ArrayList<T> readAll();
            

    
}
