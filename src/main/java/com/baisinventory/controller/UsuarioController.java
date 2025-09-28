package com.baisinventory.controller;

import com.baisinventory.DAO.RepuestoDAO;
import com.baisinventory.DAO.UsuarioDAO;
import com.google.gson.Gson;

public class UsuarioController {
    private UsuarioDAO dao = new UsuarioDAO();
    private Gson gson = new Gson();

    public String getUsuarios() {
        return gson.toJson(dao.listarUsuarios());
    }
}