package com.baisinventory.model;

public class Exportacion {
    private int id_exportacion;
    private String ubicacion;
    private String destino;
    private int id_Usuario_responsable;

    public Exportacion(int id_exportacion, String ubicacion, String destino, int id_Usuario_responsable) {
        this.id_exportacion = id_exportacion;
        this.ubicacion = ubicacion;
        this.destino = destino;
        this.id_Usuario_responsable = id_Usuario_responsable;
    }

    public int getId_exportacion() { return id_exportacion; }
    public String getUbicacion() { return ubicacion; }
    public String getDestino() { return destino; }
    public int getId_Usuario_responsable() { return id_Usuario_responsable; }

    public void setId_exportacion(int id_exportacion) { this.id_exportacion = id_exportacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setId_Usuario_responsable(int id_Usuario_responsable) { this.id_Usuario_responsable = id_Usuario_responsable; }
}
