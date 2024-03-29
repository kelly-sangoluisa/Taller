package VistaAdministracion;

import Negocio.Opciones;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFPelicula extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Opciones op;
    int idAux;//primarykey
    //tabla
    int idTabla=3;
       String[] Titulos={"IdPelicula","Titulo","Idioma"};
       String nombreTabla = "SELECT * FROM pelicula";
       //
    public JFPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("IdPelicula");
        modelo.addColumn("Titulo");
        modelo.addColumn("Idioma");
        Tabla.setModel(modelo);
        op = new Opciones();
        ImageIcon limpiar= new ImageIcon(getClass().getResource("/Imagenes/borrar.png"));
        ImageIcon icono = new ImageIcon (limpiar.getImage().getScaledInstance(btnLimpiar.getWidth(),btnLimpiar.getHeight(),Image.SCALE_DEFAULT));
        btnLimpiar.setIcon(icono);
        btnLimpiar.setContentAreaFilled(false);
        op.cargarTabla(modelo, Tabla, nombreTabla, Titulos, idTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jTFIdioma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFIdPelicula = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Pelicula = new javax.swing.JMenuItem();
        Sala = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pelicula");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Pelicula"));

        jLabel1.setText("Titulo");

        jLabel2.setText("Idioma");

        jLabel4.setText("IdPelicula");

        jTFIdPelicula.setEditable(false);
        jTFIdPelicula.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFTitulo)
                    .addComponent(jTFIdioma)
                    .addComponent(jTFIdPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgregrar.setText("Agregar");
        btnAgregrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de datos"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPelicula", "Titulo", "Idioma"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("( Para modificar o eliminar seleccione la fila )");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnLimpiar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Archivos");

        Pelicula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Pelicula.setText("Pelicula ");
        Pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeliculaActionPerformed(evt);
            }
        });
        jMenu2.add(Pelicula);

        Sala.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Sala.setText("Sala/Asiento");
        Sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaActionPerformed(evt);
            }
        });
        jMenu2.add(Sala);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Funcion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void btnAgregrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregrarActionPerformed
        String Titulo = jTFTitulo.getText();
        String Idioma = jTFIdioma.getText();
        if (Titulo.equals("") || Idioma.equals("")){
                JOptionPane.showMessageDialog(null, "No se puede dejar campos vacios, por favor ingrese los datos");
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de agregar la siguiente pelicula?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_OPTION){
                try{
                    String sql = "insert into pelicula (Titulo, Idioma)values ('"+Titulo+"','"+Idioma+"')";
                    op.opcioness(sql);
                    JOptionPane.showMessageDialog(null, "Se agrego con exito una nueva Pelicula");
                    jTFIdPelicula.setText("");
                    jTFIdioma.setText("");
                    jTFTitulo.setText("");
                  op.cargarTabla(modelo, Tabla, nombreTabla, Titulos, idTabla);
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Ocurrio un error al intentar agregar una nueva Pelicula");
                } 
                op.cargarTabla(modelo, Tabla, nombreTabla, Titulos, idTabla);
            }else{
            JOptionPane.showMessageDialog(null, "Agregracion cancelada");
            jTFIdPelicula.setText("");
            jTFTitulo.setText("");
            jTFIdioma.setText("");
            }
        }
        Tabla.clearSelection();   
    }//GEN-LAST:event_btnAgregrarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();  
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila");
        }else{
            idAux = (int) Tabla.getValueAt(fila,0);//guardando la llave primaria de la fila de la nombreTabla
            String IdPelicula = Tabla.getValueAt(fila,0).toString();
            String Titulo = Tabla.getValueAt(fila,1).toString();
            String Idioma = (String) Tabla.getValueAt(fila, 2);
            jTFIdPelicula.setText(IdPelicula);
            jTFTitulo.setText(Titulo);
            jTFIdioma.setText(Idioma);  
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String IdTitulo = jTFTitulo.getText();
        String Idioma = jTFIdioma.getText();
        int fila = Tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la pelicula que desea eliminar, por favor, seleccione la pelicula que desea eliminar");              
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar los siguientes datos", "Alerta!", JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_OPTION){
                try{
                    String sql = "UPDATE pelicula SET Titulo='"+IdTitulo+"', Idioma='"+Idioma+"' WHERE IdPelicula="+idAux;
                    op.opcioness(sql);
                    JOptionPane.showMessageDialog(null,"Datos actualizados correctamente.");
                    jTFIdPelicula.setText("");
                    jTFIdioma.setText("");
                    jTFTitulo.setText("");
                   // op.cargarTablaPelicula(modelo,Tabla);
                    op.cargarTabla(modelo, Tabla, nombreTabla, Titulos, idTabla);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Ocurrio un error al intentar actualizar.");
                }
            }else{
            JOptionPane.showMessageDialog(null, "Actualización cancelada");
            }
        }
        Tabla.clearSelection();   
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = Tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la pelicula que desea eliminar, por favor, seleccione la pelicula que desea eliminar");              
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la siguiente pelicula?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_OPTION){
                try { 
                    String sql = "delete from pelicula where IdPelicula="+idAux;
                    op.opcioness(sql);
                    //this.act();
                    JOptionPane.showMessageDialog(null, "Se ha eliminado la pelicula");
                    jTFIdPelicula.setText("");
                    jTFIdioma.setText("");
                    jTFTitulo.setText("");
                    op.cargarTabla(modelo, Tabla, nombreTabla, Titulos, idTabla);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al eliminar la pelicula");
                } 
            }else{
                JOptionPane.showMessageDialog(null, "Eliminacion cancelada");
            }  
        }
        Tabla.clearSelection();   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTFIdPelicula.setText("");
        jTFIdioma.setText("");
        jTFTitulo.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void PeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeliculaActionPerformed
        JFPelicula jfpelicula = new JFPelicula ();
        jfpelicula.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PeliculaActionPerformed

    private void SalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaActionPerformed
        JFAsiento_SalaUnido jfsala = new  JFAsiento_SalaUnido();
        jfsala.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFFuncion jfuncion = new  JFFuncion();
        jfuncion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFCliente jcliente = new  JFCliente();
        jcliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Pelicula;
    private javax.swing.JMenuItem Sala;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFIdPelicula;
    private javax.swing.JTextField jTFIdioma;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
