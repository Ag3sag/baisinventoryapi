package com.baisinventory.DAO;

import com.baisinventory.model.Ensamble;
import java.util.ArrayList;
import java.util.List;

public class EnsambleDAO {
    public List<Ensamble> listarEnsambles() {
        List<Ensamble> lista = new ArrayList<>();
        lista.add(new Ensamble(1, "Bicicleta", "Taller 1", 1));
        lista.add(new Ensamble(2, "Silla", "Taller 2", 2));
        return lista;
    }
}
