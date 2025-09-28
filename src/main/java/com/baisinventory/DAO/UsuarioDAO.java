package com.baisinventory.DAO;

import com.baisinventory.model.usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public List<usuario> listarUsuarios() {
        List<usuario> lista = new ArrayList<>();
        lista.add(new usuario(1, "JUAN01", "1234", "admin"));
        lista.add(new usuario(2, "MARIA02", "abcd", "trabajador"));
        return lista;
    }
}
