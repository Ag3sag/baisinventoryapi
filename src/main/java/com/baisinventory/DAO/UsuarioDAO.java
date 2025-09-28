package com.baisinventory.DAO;

import com.baisinventory.model.usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() {
        conn = Conexion.getConnection();
    }

    public List<usuario> listarUsuarios() {
        List<usuario> lista = new ArrayList<>();
        String sql = "SELECT id, claveAcceso, contrasena, rol FROM usuarios";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new usuario(
                        rs.getInt("id"),
                        rs.getString("claveAcceso"),
                        rs.getString("contrasena"),
                        rs.getString("rol")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
