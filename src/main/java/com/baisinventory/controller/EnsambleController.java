package com.baisinventory.controller;

import com.baisinventory.DAO.EnsambleDAO;
import com.google.gson.Gson;

public class EnsambleController {
    private EnsambleDAO dao = new EnsambleDAO();
    private Gson gson = new Gson();

    public String getEnsambles() {
        return gson.toJson(dao.listarEnsambles());
    }
}
