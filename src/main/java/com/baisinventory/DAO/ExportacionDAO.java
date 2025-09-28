package com.baisinventory.DAO;

import com.baisinventory.model.Exportacion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExportacionDAO {
    private Connection conn;

    public ExportacionDAO() {
        conn = Conexion.getConnection();
    }

    public List<Exportacion> listarExportaciones() {
        List<Exportacion> lista = new ArrayList<>();
        String sql = "SELECT id_exportacion, ubicacion, destino, id_usuario_responsable FROM exportacion";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Exportacion(
                        rs.getInt("id"),
                        rs.getString("ubicacion"),
                        rs.getString("destino"),
                        rs.getInt("idUsuario")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}