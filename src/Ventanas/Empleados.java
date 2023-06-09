/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import Conexion.ConexionGYM;
import MetodosDAO.EmpleadosDAO;
import MetodosVO.EmpleadosVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Paxtian
 */
public class Empleados extends javax.swing.JFrame {
    private final ConexionGYM CON;
    Statement ps;
    private ResultSet rs;
    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
        setLocationRelativeTo(null);
        CON = ConexionGYM.getInstacia();
        transparenciaButton();
        mostrarA();
    }

    String [] botones = {"Gris oscuro","Gris","Cafe","Azul","Morado","Verde"};
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtAyuda = new javax.swing.JButton();
        BtColor = new javax.swing.JButton();
        BtVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Rfc = new javax.swing.JTextField();
        Genero = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaA = new javax.swing.JTable();
        Ocupacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Con = new javax.swing.JTextField();
        BtConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 85, -1, -1));

        Barra.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO DEL GYM BLANCO 50x50.png"))); // NOI18N

        BtAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AYUDA 40x40.png"))); // NOI18N
        BtAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAyudaActionPerformed(evt);
            }
        });

        BtColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/COLOR 40x40.png"))); // NOI18N
        BtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtColorActionPerformed(evt);
            }
        });

        BtVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VOLVER 40x40.png"))); // NOI18N
        BtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleados");

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(319, 319, 319)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(BtAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtVolver)
                    .addComponent(BtAyuda)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setText(" ID EMPLEADO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setText("NOMBRE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel6.setText("TELEFONO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel7.setText("RFC");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel8.setText("GENERO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel9.setText("APELLIDO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel10.setText("EDAD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONSULTA INDIVIDUAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 260, -1));
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 220, 30));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 220, 30));
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 220, 30));
        getContentPane().add(Rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, 30));
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 220, 30));
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 220, 30));
        getContentPane().add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 220, 30));
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 330, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        jButton1.setText("GUARDAR EMPLEADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 160, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        jButton2.setText("CAMBIAR DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 160, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        jButton3.setText("ELIMINAR EMPLEADO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 160, 30));

        TablaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID EMPLEADO", "NOMBRE", "APELLIDO", "GENERO", "EDAD", "OCUPACION", "TELEFONO", "RFC", "DIRECCION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 980, 260));
        getContentPane().add(Ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 220, 30));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel12.setText("OCUPACION");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel13.setText("DIRECCION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 130, -1));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel14.setText("INGRESE EL ID DEL EMPLEADO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 290, 30));
        getContentPane().add(Con, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 110, 30));

        BtConsultar.setBackground(new java.awt.Color(255, 255, 0));
        BtConsultar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        BtConsultar.setText("CONSULTAR");
        BtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(BtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 110, 30));

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID EMPLEADO", "NOMBRE", "APELLIDO", "GENERO", "EDAD", "OCUPACION", "TELEFONO", "RFC", "DIRECCION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(T1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 980, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EMPLEADOS VENTANA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    EmpleadosVO AV = new EmpleadosVO();
    EmpleadosDAO AD = new EmpleadosDAO();

    public void transparenciaButton(){
        BtAyuda.setOpaque(false);
        BtAyuda.setContentAreaFilled(false);
        BtAyuda.setBorderPainted(false);
        BtVolver.setOpaque(false);
        BtVolver.setContentAreaFilled(false);
        BtVolver.setBorderPainted(false);
        BtColor.setOpaque(false);
        BtColor.setContentAreaFilled(false);
        BtColor.setBorderPainted(false);
    }
    
    DefaultTableModel modelA;
        void mostrarA(){
        String sql= "select * from empleado";
        try {
            Connection ConexionGYM = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] empleados = new Object[9];
            modelA = (DefaultTableModel) TablaA.getModel();
            while(rs.next()){
                empleados [0] = rs.getString("id_empleado");
                empleados [1] = rs.getString("nombre");
                empleados [2] = rs.getString("apellido");
                empleados [3] = rs.getString("genero");
                empleados [4] = rs.getString("edad");
                empleados [5] = rs.getString("ocupacion");
                empleados [6] = rs.getString("telefono");
                empleados [7] = rs.getString("rfc");
                empleados [8] = rs.getString("direccion");
                modelA.addRow(empleados);
            }
            TablaA.setModel(modelA);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }        
    }
    
   void limpiarA(){
        for (int i =0 ; i<=TablaA.getRowCount(); i++){
            modelA.removeRow(i);
            i = i-1;
        }
    }
   
    void insertar(){
        
        String id_empleado=Id.getText();
        String nombre=Nombre.getText();
        String apellido=Apellido.getText();
        String genero=Genero.getText();
        String edad=Edad.getText();
        String ocupacion=Ocupacion.getText();
        String telefono=Telefono.getText();
        String rfc=Rfc.getText();
        String direccion=Direccion.getText();
    
        try{
            if(id_empleado.equals("") || nombre.equals("") || apellido.equals("") || genero.equals("") || edad.equals("") || ocupacion.equals("") || telefono.equals("") || rfc.equals("") || direccion.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos del empleado.");
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps = ConexionGYM.createStatement();
                String sql = "insert into empleado values('"+id_empleado+"','"+nombre+"','"+apellido+"','"+genero+"','"+edad+"','"+ocupacion+"','"+telefono+"','"+rfc+"','"+direccion+"')";
                ps.execute(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Empleado registrado.");
                limpiarA();             
            }
        }catch(Exception e){
            //System.out.println("Error al insertar");
        }
    }
    
    void modificar(){
        
        String id_empleado=Id.getText();
        String nombre=Nombre.getText();
        String apellido=Apellido.getText();
        String genero=Genero.getText();
        String edad=Edad.getText();
        String ocupacion=Ocupacion.getText();
        String telefono=Telefono.getText();
        String rfc=Rfc.getText();
        String direccion=Direccion.getText();
        
        try{
            if(id_empleado.equals("") || nombre.equals("") || apellido.equals("") || genero.equals("") || edad.equals("") || ocupacion.equals("") || telefono.equals("") || rfc.equals("") || direccion.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql = "update empleado set nombre='"+nombre+"', apellido='"+apellido+"', genero='"+genero+"', edad='"+edad+"', ocupacion='"+ocupacion+"', telefono='"+telefono+"', rfc='"+rfc+"', direccion='"+direccion+"' where id_empleado='" +id_empleado+ "'; ";
                ps.executeUpdate(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Empleado actualizado.");
                limpiarA();
            }
            
        }catch(Exception e){
            //System.out.println("Usuario no registrado");
        }
        
    }
    
    void eliminar(){
        String id_empleado=Id.getText();
        //int fila = TablaA.getSelectedRow();
        try{
            if(id_empleado.equals("")){
               JOptionPane.showMessageDialog(null, "Empleado no seleccionado");
               limpiarA();
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql="delete from empleado where id_empleado='"+id_empleado+"'; ";
                ps.executeUpdate(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Empleado dado de baja");
                limpiarA();
            }
             
        }catch(Exception e){
         
        }
    
    } 

    public void ConsultaSoc(){
        String NOMBRE=Con.getText();
        String sql= "SELECT * FROM empleado WHERE id_empleado ='"+NOMBRE+"';";
        try {
            Connection ConexionGYM = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] cons = new Object[9];
            modelA = (DefaultTableModel) T1.getModel();
            while(rs.next()){
                cons [0] = rs.getString("id_empleado");
                cons [1] = rs.getString("nombre");
                cons [2] = rs.getString("apellido");
                cons [3] = rs.getString("genero");
                cons [4] = rs.getString("edad");
                cons [5] = rs.getString("ocupacion");
                cons [6] = rs.getString("telefono");
                cons [7] = rs.getString("rfc");
                cons [8] = rs.getString("direccion");
                modelA.addRow(cons);
            }
            T1.setModel(modelA);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
    }
    public void limpiar(){
        modelA.getDataVector().removeAllElements();
        T1.updateUI();
    }
        
    private void BtAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "★Seccion de empleados★ \n ☛ Primero llena las casillas con los datos que se pide "
        + "\n ☛ Despues seleccione la accion a realizar \n ☛ Los datos registrados apareceran en la parte inferior \n ⇩ Para dar baja solo ingrese el id del empreado");
        JOptionPane.showMessageDialog(rootPane, "Para mas ayuda y asistencia tecnica contactenos \n ✉ Correo: fpaxtian@hotmail.com \n "
        + "☎ Telefono: 9621848035");
        JOptionPane.showMessageDialog(rootPane, "Programa desarrollado por: \n♛ Francisco Javier Paxtian Gordillo");
    }//GEN-LAST:event_BtAyudaActionPerformed

    private void BtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtColorActionPerformed
        int x = JOptionPane.showOptionDialog(this,"Elige un color","Color de la barra superior",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
        if(x==0){
            Barra.setBackground(Color.darkGray);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==1){
            Barra.setBackground(Color.gray);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==2){
            Color colorCafe=new Color(144, 68, 7);
            Barra.setBackground(colorCafe);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==3){
            Color colorAzul=new Color(0, 0, 153);
            Barra.setBackground(colorAzul);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==4){
            Color colorMorado=new Color(153, 0, 153);
            Barra.setBackground(colorMorado);
            JOptionPane.showMessageDialog(this,"Color aplicado!");            
        }else if(x==5){
            Color colorVerde=new Color(0, 204, 0);
            Barra.setBackground(colorVerde);
            JOptionPane.showMessageDialog(this,"Color aplicado!");              
        }
    }//GEN-LAST:event_BtColorActionPerformed

    private void BtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVolverActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BtVolverActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertar();
        mostrarA();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificar();
        mostrarA();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminar();
        mostrarA();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarActionPerformed
        limpiar();
        ConsultaSoc();
    }//GEN-LAST:event_BtConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BtAyuda;
    private javax.swing.JButton BtColor;
    private javax.swing.JButton BtConsultar;
    private javax.swing.JButton BtVolver;
    private javax.swing.JTextField Con;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Genero;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Ocupacion;
    private javax.swing.JTextField Rfc;
    private javax.swing.JTable T1;
    private javax.swing.JTable TablaA;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
