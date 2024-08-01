
package com.duoc.modelos;


public class Usuario {
    
    //atributos
    private String username;
    private String password;
    private int nivel_privilegio;

    public Usuario() {
    }

    public Usuario(String username, String password, int nivel_privilegio) {
        this.username = username;
        this.password = password;
        this.nivel_privilegio = nivel_privilegio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNivel_privilegio() {
        return nivel_privilegio;
    }

    public void setNivel_privilegio(int nivel_privilegio) {
        this.nivel_privilegio = nivel_privilegio;
    }
    
    
}
