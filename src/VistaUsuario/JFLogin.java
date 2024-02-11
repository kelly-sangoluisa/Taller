package VistaUsuario;


import Negocio.Conexion;
import Negocio.OpcionesLogin;
import VistaAdministracion.JFPanel;
import VistaAdministracion.JFPelicula;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFLogin extends javax.swing.JFrame {
    OpcionesLogin op;
    public JFLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
        op = new OpcionesLogin();
        ImageIcon cinelogin= new ImageIcon(getClass().getResource("/Imagenes/cinelogin.png"));
        ImageIcon icono = new ImageIcon (cinelogin.getImage(
        ).getScaledInstance(jLbImagen.getWidth(),jLbImagen.getHeight(),Image.SCALE_DEFAULT));
        jLbImagen.setIcon(icono);
        ImageIcon cinefondo= new ImageIcon(getClass().getResource("/Imagenes/cinelogin_1.png"));
        ImageIcon icon = new ImageIcon (cinefondo.getImage(
        ).getScaledInstance(jLFondo.getWidth(),jLFondo.getHeight(),Image.SCALE_DEFAULT));
        jLFondo.setIcon(icon);
        setIconImage(getIconImage()); 
        String r = "<html><u>Registrarse</u></html>";
        jLabelR.setText(r);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdministracion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPFPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTXUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLbImagen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelR = new javax.swing.JLabel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setBackground(new java.awt.Color(248, 248, 230));

        btnAdministracion.setBackground(java.awt.Color.lightGray);
        btnAdministracion.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        btnAdministracion.setText("Administración");
        btnAdministracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseExited(evt);
            }
        });
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar Sesion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 11))); // NOI18N
        jPanel1.setOpaque(false);

        jPFPassword.setBackground(new java.awt.Color(255, 227, 194));
        jPFPassword.setToolTipText("");
        jPFPassword.setName(""); // NOI18N
        jPFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel1.setText("Usuario");

        jTXUsuario.setBackground(new java.awt.Color(255, 227, 194));
        jTXUsuario.setToolTipText("");
        jTXUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTXUsuarioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setText("Contraseña");

        btnIngresar.setBackground(java.awt.Color.lightGray);
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(java.awt.Color.lightGray);
        btnSalir.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTXUsuario)
                            .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTXUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("¿Aún no tienes una cuenta?");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Si ya tienes una cuenta ingresa tus datos:");

        jLabelR.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        jLabelR.setText("Registrarse");
        jLabelR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRMouseExited(evt);
            }
        });

        jLFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabelR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(95, 95, 95))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelR))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/cineicon.png"));
       return retValue;
       //setIconImage(getIconImage()); 
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       // Statement sql = Conexion.getConection("hola", "kk").createStament();
        String consulta = "select * from Prueba.dbo.Tabla";
        //ResultSet rs = pps.executeQuery(consulta);
    }//GEN-LAST:event_btnSalirActionPerformed

    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    try{
        String nombre;
        
        String password = String.valueOf(this.jPFPassword.getPassword());
        int Usuario = Integer.parseInt(this.jTXUsuario.getText());
        if (this.jPFPassword.getPassword().length == 0||this.jTXUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los datos");
        }else{      
            if(op.validarUsuario(Usuario, password)){
                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
                //op.obtenerNombreUsuario(Usuario);
                nombre = op.obtenerNombreUsuario(Usuario);
                this.setVisible(false);
                JFCartelera jfpanel = new JFCartelera(Usuario,nombre);
                jfpanel.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "El Usuario o contraseña ingresados no son validos\n          Porfavor Ingrese nuevamente            ");
                this.jTXUsuario.setText("");
                this.jPFPassword.setText("");               
            }
        }
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Complete todos los datos");
    }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(Color.LIGHT_GRAY);
        btnIngresar.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(Color.YELLOW);
        btnIngresar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnIngresarMouseExited

    private void jTXUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTXUsuarioKeyTyped
       this.validadorNumero(evt);
    }//GEN-LAST:event_jTXUsuarioKeyTyped

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.LIGHT_GRAY);
        btnSalir.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.YELLOW);
        btnSalir.setBackground(Color.LIGHT_GRAY);//DDCBAD
    }//GEN-LAST:event_btnSalirMouseExited

    private void jLabelRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRMouseClicked
        JFCrearCliente c = new JFCrearCliente();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelRMouseClicked

    private void jLabelRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRMouseEntered
        jLabelR.setForeground(Color.BLACK);
        jLabelR.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabelRMouseEntered

    private void jLabelRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRMouseExited
        jLabelR.setForeground(Color.BLUE);
        jLabelR.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelRMouseExited

    private void btnAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseEntered
        btnAdministracion.setBackground(Color.LIGHT_GRAY);
        btnAdministracion.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnAdministracionMouseEntered

    private void btnAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseExited
        btnAdministracion.setBackground(Color.ORANGE);
        btnAdministracion.setBackground(Color.LIGHT_GRAY);//DDCBAD
    }//GEN-LAST:event_btnAdministracionMouseExited

    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed
        
        String linea = JOptionPane.showInputDialog(null, "Por favor ingrese el codigo administrativo","CODIGO", 
                JOptionPane.INFORMATION_MESSAGE);
        String codigoA = "123";
        String codigoB = "321";
        String[] partes = linea.split("-");
        String primeraParte = partes[0];
        String segundaParte = partes[1];
        System.out.println("Primera parte: " + primeraParte);
        System.out.println("Segunda parte: " + segundaParte);
        
        if (!op.validarIdUnico(Integer.parseInt(primeraParte))){
            if(codigoA.equals(segundaParte)){
                JFCrearCliente c = new JFCrearCliente();
                c.setVisible(true);
                this.setVisible(false);
            }else if(codigoB.equals(segundaParte)){
                JFCartelera p = new JFCartelera();
                p.setVisible(true);
                this.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Codigo incorrecto");
        }
    }//GEN-LAST:event_btnAdministracionActionPerformed

    private void jPFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFPasswordActionPerformed

     public void validadorNumero (java.awt.event.KeyEvent evt){
         char variable = evt.getKeyChar();
        if (Character.isLetter(variable)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros ","Error",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelR;
    private javax.swing.JLabel jLbImagen;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTXUsuario;
    // End of variables declaration//GEN-END:variables
}
