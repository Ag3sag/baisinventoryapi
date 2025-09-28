package com.baisinventory.DAO;

import com.baisinventory.model.Repuesto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepuestoDAO {
    private Connection conn;

    public RepuestoDAO() {
        conn = Conexion.getConnection();
    }

    public List<Repuesto> listarRepuestos() {
        List<Repuesto> lista = new ArrayList<>();
        String sql = "SELECT id_repuesto, Nombre, cantidad, ubicacion FROM repuesto";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Repuesto(
                        rs.getInt("id_repuesto"),
                        rs.getString("Nombre"),
                        rs.getInt("cantidad"),
                        rs.getString("ubicacion")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
