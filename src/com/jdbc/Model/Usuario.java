package com.jdbc.Model;

public class Usuario {

    private int idUsuario;
    private String nomeUsuario;
    private String loginUsuario;
    private String senhaUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public String getLoginUsuario() {
        return loginUsuario;
    }
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
