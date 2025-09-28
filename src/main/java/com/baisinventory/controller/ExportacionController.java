package com.baisinventory.controller;

import com.baisinventory.DAO.ExportacionDAO;
import com.google.gson.Gson;

public class ExportacionController {
    private ExportacionDAO dao = new ExportacionDAO();
    private Gson gson = new Gson();

    public String getExportaciones() {
        return gson.toJson(dao.listarExportaciones());
    }
}
