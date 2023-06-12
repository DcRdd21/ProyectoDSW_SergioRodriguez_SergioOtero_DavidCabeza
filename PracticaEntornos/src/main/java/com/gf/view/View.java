package com.gf.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
    }
   
    public JButton getjButtonNewTrabajador() {
        return jButtonNewTrabajador;
    }

    public void setjButtonNewTrabajador(JButton jButtonNewTrabajador) {
        this.jButtonNewTrabajador = jButtonNewTrabajador;
    }

    public JPanel getjPanelCentral() {
        return jPanelCentral;
    }

    public void setjPanelCentral(JPanel jPanelCentral) {
        this.jPanelCentral = jPanelCentral;
    }

    public JPanel getjPanelInferior() {
        return jPanelInferior;
    }

    public void setjPanelInferior(JPanel jPanelInferior) {
        this.jPanelInferior = jPanelInferior;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public String getjTextFieldApellidos() {
        return jTextFieldApellidos.getText();
    }

    public void setjTextFieldApellidos(JTextField jTextFieldApellidos) {
        this.jTextFieldApellidos = jTextFieldApellidos;
    }

    public String getjTextFieldCC() {
        return jTextFieldCC.getText();
    }

    public void setjTextFieldCC(JTextField jTextFieldCC) {
        this.jTextFieldCC = jTextFieldCC;
    }

    public String getjTextFieldDNI() {
        return jTextFieldDNI.getText();
    }

    public void setjTextFieldDNI(JTextField jTextFieldDNI) {
        this.jTextFieldDNI = jTextFieldDNI;
    }

    public String getjTextFieldDireccion() {
        return jTextFieldDireccion.getText();
    }

    public void setjTextFieldDireccion(JTextField jTextFieldDireccion) {
        this.jTextFieldDireccion = jTextFieldDireccion;
    }

    public String getjTextFieldNombre() {
        return jTextFieldNombre.getText();
    }

    public void setjTextFieldNombre(JTextField jTextFieldNombre) {
        this.jTextFieldNombre = jTextFieldNombre;
    }

    public String getjTextFieldRol() {
        return jTextFieldRol.getText();
    }

    public void setjTextFieldRol(JTextField jTextFieldRol) {
        this.jTextFieldRol = jTextFieldRol;
    }

    public double getjTextFieldSS() {
        return Double.parseDouble(jTextFieldSS.getText());
    }

    public void setjTextFieldSS(JTextField jTextFieldSS) {
        this.jTextFieldSS = jTextFieldSS;
    }

    public Double getjTextFieldSueldo() {
        return Double.parseDouble(jTextFieldSueldo.getText());
    }

    public void setjTextFieldSueldo(JTextField jTextFieldSueldo) {
        this.jTextFieldSueldo = jTextFieldSueldo;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelInferior = new javax.swing.JPanel();
        jButtonNewTrabajador = new javax.swing.JButton();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonNewTrabajador.setText("AÑADIR TRABAJADOR");

        jLabel2.setText("DNI: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Rol:");

        jLabel6.setText("Sueldo:");

        jLabel8.setText("Cuenta Corriente:");

        jLabel9.setText("Direccion:");

        jLabel10.setText("Seguridad Social:");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInferiorLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(50, 50, 50)))))
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(253, 253, 253)
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCC, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSS, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jButtonNewTrabajador)
                .addGap(100, 100, 100))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInferiorLayout.createSequentialGroup()
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelInferiorLayout.createSequentialGroup()
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                                .addComponent(jButtonNewTrabajador)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewTrabajador;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCC;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRol;
    private javax.swing.JTextField jTextFieldSS;
    private javax.swing.JTextField jTextFieldSueldo;
    // End of variables declaration//GEN-END:variables
}
