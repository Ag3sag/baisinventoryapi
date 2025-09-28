package com.baisinventory.model;

public class Ensamble {
    private int id_ensamble;
    private String nombre;
    private String ubicacion;
    private int id_Usuario_Responsable;

    public Ensamble(int id, String nombre, String ubicacion, int idUsuarioResponsable) {
        this.id_ensamble = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.id_Usuario_Responsable = idUsuarioResponsable;
    }

    public int getId() { return id_ensamble; }
    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public int getIdUsuarioResponsable() { return id_Usuario_Responsable; }
}