package com.baisinventory.DAO;

import com.baisinventory.model.Repuesto;
import java.util.ArrayList;
import java.util.List;

public class RepuestoDAO {
    public List<Repuesto> listarRepuestos() {
        List<Repuesto> lista = new ArrayList<>();
        lista.add(new Repuesto(1, "Tornillo", 50, "Bodega A"));
        lista.add(new Repuesto(2, "Tuerca", 100, "Bodega B"));
        return lista;
    }
}
