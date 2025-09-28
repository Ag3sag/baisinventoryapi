package com.baisinventory;

import static spark.Spark.*;
import com.baisinventory.controller.*;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();
        UsuarioController uc = new UsuarioController();
        RepuestoController rc = new RepuestoController();
        EnsambleController ec = new EnsambleController();
        ExportacionController exc = new ExportacionController();

        port(8080); // Puerto del servidor

        // Endpoints
        get("/usuarios", (req, res) -> {
            res.type("application/json");
            return uc.getUsuarios();
        });

        get("/repuestos", (req, res) -> {
            res.type("application/json");
            return rc.getRepuestos();
        });

        get("/ensambles", (req, res) -> {
            res.type("application/json");
            return ec.getEnsambles();
        });

        get("/exportaciones", (req, res) -> {
            res.type("application/json");
            return exc.getExportaciones();
        });

        System.out.println("Servidor corriendo en http://localhost:8080");
    }
}