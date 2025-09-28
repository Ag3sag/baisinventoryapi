package com.baisinventory.model;

public class Repuesto {
    private int id_repuesto;
    private String Nombre;
    private int cantidad;
    private String ubicacion;

    public Repuesto(int id_repuesto, String nombre, int cantidad, String ubicacion) {
        this.id_repuesto = id_repuesto;
        this.Nombre = nombre;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    public int getId_repuesto() { return id_repuesto; }
    public String getNombre() { return Nombre; }
    public int getCantidad() { return cantidad; }
    public String getUbicacion() { return ubicacion; }
}