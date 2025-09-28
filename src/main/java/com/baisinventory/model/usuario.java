package com.baisinventory.model;

public class usuario {
    private int id_usuario;
    private String claveAcceso;
    private String contrasena;
    private String rol;

    // Constructor con ID y rol
    public usuario(int id, String claveAcceso, String contrasena, String rol) {
        this.id_usuario = id;
        this.claveAcceso = claveAcceso;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Getters
    public int getId() { return id_usuario; }
    public String getClaveAcceso() { return claveAcceso; }
    public String getContrasena() { return contrasena; }
    public String getRol() { return rol; }

    public usuario() {
        // Constructor vacío necesario para JavaFX o frameworks
    }
    // Setters
    public void setId(int id) { this.id_usuario = id; }
    public void setClaveAcceso(String claveAcceso) { this.claveAcceso = claveAcceso; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public void setRol(String rol) { this.rol = rol; }
}
