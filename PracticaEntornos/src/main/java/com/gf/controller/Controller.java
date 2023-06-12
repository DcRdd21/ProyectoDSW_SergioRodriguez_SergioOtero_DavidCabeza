package com.gf.controller;

import com.gf.dao.TrabajadoresDAO;
import com.gf.entities.Trabajadores;
import com.gf.utilities.ConexionBD;
import com.gf.view.View;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controller implements ActionListener{
    private final Trabajadores modelo;
    private final View vista;
    private DefaultTableModel modeloTabla;
    private String[] nombresColumnas = {"dni_trabajador", "id_trabajador", "nombre_trabajador",
        "apellidos_trabajador", "rol_trabajador", "sueldo_trabajador", "cc_trabajador", 
        "direccion_trabajador", "ss_trabajador"};
    private Integer nTrabajadores=0;

    public Controller(Trabajadores modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.getjButtonNewTrabajador().addActionListener(this);
        vista.setVisible(true);
    }

    public void setFrame(){
        vista.setTitle("Trabajadores");
        vista.setResizable(false);
        vista.setExtendedState(MAXIMIZED_BOTH);
        modeloTabla = new DefaultTableModel(null, nombresColumnas);
        vista.getjTable1().setModel(modeloTabla);
        obtenerTrabajadores();
    }
    
    private void obtenerTrabajadores() {
        try ( Connection con = ConexionBD.getConnection()) {
            ArrayList<Trabajadores> trabajadores = TrabajadoresDAO.select();
            nTrabajadores=trabajadores.size();
            for (int i = trabajadores.size() - 1; i >= 0; i--) {
                modeloTabla.addRow(new String[]{trabajadores.get(i).getDniTrabajador(),
                                    String.valueOf(trabajadores.get(i).getIdTrabajador()),
                                    trabajadores.get(i).getNombreTrabajador(),
                                    trabajadores.get(i).getApellidosTrabajador(),
                                    trabajadores.get(i).getRolTrabajador(),
                                    String.valueOf(trabajadores.get(i).getSueldoTrabajador()),
                                    trabajadores.get(i).getCcTrabajador(),
                                    trabajadores.get(i).getDniTrabajador(),
                                    String.valueOf(trabajadores.get(i).getSsTrabajador())});
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Trabajadores trabajador=new Trabajadores(vista.getjTextFieldDNI(),
                    nTrabajadores++,
                    vista.getjTextFieldNombre(),
                    vista.getjTextFieldApellidos(),
                    vista.getjTextFieldRol(),
                    vista.getjTextFieldSueldo(),
                    vista.getjTextFieldCC(),
                    vista.getjTextFieldDireccion(),
                    vista.getjTextFieldSS());
            TrabajadoresDAO.insert(trabajador);
            for(int i=0;i<=modeloTabla.getRowCount();i++){
                modeloTabla.removeRow(i);
            }
            obtenerTrabajadores();
        } catch (SQLException ex) {
        }
    }
    
    
}
