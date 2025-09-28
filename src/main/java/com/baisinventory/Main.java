package com.baisinventory;

import com.baisinventory.controller.*;

public class Main {
    public static void main(String[] args) {
        UsuarioController uc = new UsuarioController();
        RepuestoController rc = new RepuestoController();
        EnsambleController ec = new EnsambleController();
        ExportacionController exc = new ExportacionController();

        System.out.println("Usuarios:");
        System.out.println(uc.getUsuarios());

        System.out.println("Repuestos:");
        System.out.println(rc.getRepuestos());

        System.out.println("Ensambles:");
        System.out.println(ec.getEnsambles());

        System.out.println("Exportaciones:");
        System.out.println(exc.getExportaciones());
    }
}