package com.gf.dao;

import com.gf.entities.Trabajadores;
import com.gf.utilities.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrabajadoresDAO {

    public static int insert(Trabajadores t) throws SQLException {
        String SQL = "INSERT INTO trabajador values(?,?,?,?,?,?,?,?,?)";
        try (Connection con = ConexionBD.getConnection()) {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, t.getDniTrabajador());
            ps.setDouble(2, t.getIdTrabajador());
            ps.setString(3, t.getNombreTrabajador());
            ps.setString(4, t.getApellidosTrabajador());
            ps.setString(5, t.getRolTrabajador());
            ps.setDouble(6, t.getSueldoTrabajador());
            ps.setString(7, t.getCcTrabajador());
            ps.setString(8, t.getDireccionTrabajador());
            ps.setDouble(9, t.getSsTrabajador());

            return ps.executeUpdate();
        }
    }

    public static int update(Trabajadores t) throws SQLException {
        String SQL = "UPDATE trabajador set(nombre_trabajador=?,apellidos_trabajador=?, rol_trabajador=?,sueldo_trabajador=?, cc_trabajador=?, direccion_trabajador=?, ss_trabajador=? WHERE dni_trabajador=?)";
        try (Connection con = ConexionBD.getConnection()) {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, t.getNombreTrabajador());
            ps.setString(2, t.getApellidosTrabajador());
            ps.setString(3, t.getRolTrabajador());
            ps.setDouble(4, t.getSueldoTrabajador());
            ps.setString(5, t.getCcTrabajador());
            ps.setString(6, t.getDireccionTrabajador());
            ps.setDouble(7, t.getSsTrabajador());
            ps.setString(8, t.getDniTrabajador());

            return ps.executeUpdate();
        }
    }

    public static boolean selectID(Trabajadores t) throws SQLException {
        boolean exist = false;
        String SQL = "SELECT * FROM trabajador WHERE dni_trabajador=?";
        try (Connection con = ConexionBD.getConnection()) {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, t.getDniTrabajador());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                exist = true;
            }
        }
        return exist;
    }
    
    public static ArrayList<Trabajadores> select () throws SQLException{
        String sql="SELECT*FROM trabajador";
        ArrayList<Trabajadores> list= new ArrayList<>();;
        try (Connection conn = ConexionBD.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Trabajadores(rs.getString("dni_trabajador"), 
                        rs.getDouble("id_trabajador"), 
                        rs.getString("nombre_trabajador"),
                        rs.getString("apellidos_trabajador"),
                        rs.getString("rol_trabajador"),
                        rs.getDouble("sueldo_trabajador"),
                        rs.getString("cc_trabajador"),
                        rs.getString("direccion_trabajador"),
                        rs.getDouble("ss_trabajador")));
            }
        }
        return list;
    }
    
    public static int delete(Trabajadores t) throws SQLException{
        String sql="DELETE FROM trabajador WHERE dni_trabajador=?";
        try (Connection con = ConexionBD.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getDniTrabajador());
            return ps.executeUpdate();
        }
    }
    
}
