package com.baisinventory.DAO;

import com.baisinventory.model.Exportacion;
import java.util.ArrayList;
import java.util.List;

public class ExportacionDAO {
    public List<Exportacion> listarExportaciones() {
        List<Exportacion> lista = new ArrayList<>();
        lista.add(new Exportacion(1, "Bodega A", "Bogotá", 1));
        lista.add(new Exportacion(2, "Bodega B", "Medellín", 2));
        return lista;
    }
}
