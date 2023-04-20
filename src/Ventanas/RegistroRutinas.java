/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.awt.Color;
import Conexion.ConexionGYM;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Francisco Paxtian
 */
public class RegistroRutinas extends javax.swing.JFrame {
    private final ConexionGYM CON;
    Statement ps;
    private ResultSet rs;
    /**
     * Creates new form RegistroRutinas
     */
    public RegistroRutinas() {
        initComponents();
        setLocationRelativeTo(null);
        CON = ConexionGYM.getInstacia();
        transparenciaButton();
        MostrarRRut();
    }

    String [] botones = {"Gris oscuro","Gris","Rosa","Rojo","Naranja","Amarillo"};
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtAyuda = new javax.swing.JButton();
        BtColor = new javax.swing.JButton();
        BtVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IdRut = new javax.swing.JTextField();
        IdSoc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRRut = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 49, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

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
        jLabel3.setText("Registro rutinas");

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(260, 260, 260)
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
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtVolver)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BarraLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(BtAyuda))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID RUTINA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID SOCIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Funciones principales");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, 20));
        getContentPane().add(IdRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, 30));
        getContentPane().add(IdSoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 110, 30));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton1.setText("ALTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 80, 30));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton2.setText("CAMBIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, 30));

        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton3.setText("BAJA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 80, 30));

        TablaRRut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RUTINA", "RUTINA", "ID SOCIO", "NOMBRE", "APELLIDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRRut);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 880, 400));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Consulta general de socios inscritos en rutinas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 330, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DETALLERUTINA VENTANA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private void BtAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "★Seccion de registro de rutinas★ \n ☛ Para inscribir un socio a una rutina o cambiarlo de rutina ingrese los datos que se pide "
            + "\n ☛ Despues seleccione la accion a realizar \n ☛ Los socios inscritos en las rutinas apareceran en la parte inferior \n ⇩ Para dar baja a un socio inscrito en alguna rutina solo ingrese el id del socio");
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
            Color colorRosa=new Color(255, 37, 140);
            Barra.setBackground(colorRosa);
            JOptionPane.showMessageDialog(this,"Color aplicado!");  
        }else if(x==3){
            Barra.setBackground(Color.red);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==4){
            Color colorNaranja=new Color(255, 108, 3);
            Barra.setBackground(colorNaranja);
            JOptionPane.showMessageDialog(this,"Color aplicado!");            
        }else if(x==5){
            Color colorAmarillo=new Color(255, 203, 34);
            Barra.setBackground(colorAmarillo);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertarRRut();
        MostrarRRut();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificarRRut();
        MostrarRRut();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminarRRut();
        MostrarRRut();
    }//GEN-LAST:event_jButton3ActionPerformed
        public void insertarRRut(){
        String id_rutina=IdRut.getText();
        String id_socio=IdSoc.getText();

      try{
            if(id_rutina.equals("") || id_socio.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql = "insert into registrorutina values('"+id_rutina+"','"+id_socio+"')";
                ps.execute(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Socio inscrito");
                limpiarRRut();
            }
        }catch(Exception e){
            System.out.println("Error al registrar");
        }
    }
    void limpiarRRut(){
        for (int i =0 ; i<=TablaRRut.getRowCount(); i++){
            ModelodP.removeRow(i);
            i = i-1;
        }
    }
    DefaultTableModel ModelodP;
    
    public void MostrarRRut(){
        String sql= "SELECT r.Id_Rutina,a.nom,r.Id_Socio, s.Nombre, s.Apellido FROM socios s, registrorutina r, rutina a WHERE r.ID_Socio = s.ID_socio AND r.Id_rutina = a.Id_rutina GROUP BY r.Id_Rutina,a.nom,r.Id_Socio, s.Nombre, s.Apellido;";
        try {
            Connection ConexionGYM = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] inv = new Object[5];
            ModelodP = (DefaultTableModel) TablaRRut.getModel();
            while(rs.next()){
                inv [0] = rs.getString("id_rutina");
                inv [1] = rs.getString("nom");
                inv [2] = rs.getString("id_socio");
                inv [3] = rs.getString("nombre");
                inv [4] = rs.getString("apellido");
                ModelodP.addRow(inv);
            }
            TablaRRut.setModel(ModelodP);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
    }
        void modificarRRut(){
        String id_rutina=IdRut.getText();
        String id_socio=IdSoc.getText();
        try{
            if(id_rutina.equals("") || id_socio.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql = "update registrorutina set id_rutina='" + id_rutina + "' where id_socio='" +id_socio+ "'; ";
                ps.executeUpdate(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Socio cambiado de rutina");
                limpiarRRut();
            }
            
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
    }
    void eliminarRRut(){
        String id_socio=IdSoc.getText();
        //int fila = TablaA.getSelectedRow();
        try{
            if(id_socio.equals("")){
               JOptionPane.showMessageDialog(null, "Socio no seleccionado");
               limpiarRRut();
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql="delete from registrorutina where id_socio='"+id_socio+"'; ";
                ps.executeUpdate(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Socio dado de baja de la rutina!.");
                limpiarRRut();
            }
             
        }catch(Exception e){
         
        }
    
    }
    
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
            java.util.logging.Logger.getLogger(RegistroRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroRutinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BtAyuda;
    private javax.swing.JButton BtColor;
    private javax.swing.JButton BtVolver;
    private javax.swing.JTextField IdRut;
    private javax.swing.JTextField IdSoc;
    private javax.swing.JTable TablaRRut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}