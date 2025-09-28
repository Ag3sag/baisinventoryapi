package com.baisinventory.controller;

import com.baisinventory.DAO.RepuestoDAO;
import com.google.gson.Gson;

public class RepuestoController {
    private RepuestoDAO dao = new RepuestoDAO();
    private Gson gson = new Gson();

    public String getRepuestos() {
        return gson.toJson(dao.listarRepuestos());
    }
}