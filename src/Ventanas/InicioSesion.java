/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import java.awt.event.KeyEvent;
//import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author UNI
 */
public class InicioSesion extends javax.swing.JDialog {

    /**
     * Creates new form InicioSesion
     *
     * @param parent
     * @param modal
     */
    public InicioSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/Images/dr-icon.png")).getImage());
        } catch (NullPointerException ex) {
        }

        initComponents();
        this.setResizable(false);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");

        /* SKINS 
– org.jvnet.substance.skin.AutumnSkin
– org.jvnet.substance.skin.BusinessBlackSteelSkin
– org.jvnet.substance.skin.BusinessBlueSteelSkin =>
– org.jvnet.substance.skin.BusinessSkin
– org.jvnet.substance.skin.CremeCoffeeSkin
– org.jvnet.substance.skin.CremeSkin
– org.jvnet.substance.skin.EmeraldDuskSkin
– org.jvnet.substance.skin.FieldOfWheatSkin
– org.jvnet.substance.skin.FindingNemoSkin
– org.jvnet.substance.skin.GreenMagicSkin
– org.jvnet.substance.skin.MagmaSkin
– org.jvnet.substance.skin.MangoSkin
– org.jvnet.substance.skin.MistAquaSkin
– org.jvnet.substance.skin.ModerateSkin
– org.jvnet.substance.skin.NebulaBrickWallSkin
– org.jvnet.substance.skin.NebulaSkin
– org.jvnet.substance.skin.OfficeBlue2007Skin
– org.jvnet.substance.skin.OfficeSilver2007Skin
– org.jvnet.substance.skin.RavenGraphiteGlassSkin
– org.jvnet.substance.skin.RavenGraphiteSkin
– org.jvnet.substance.skin.RavenSkin
– org.jvnet.substance.skin.SaharaSkin
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar Sesion");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contrasena");

        txtUser.setText("Admin");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        txtPass.setText("1234");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435362010_Login.png"))); // NOI18N
        jButton1.setText("Conectar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355601_sign-error.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(385, 207));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
ResultSet resultado;

    public void Conectar() {

        String User = txtUser.getText().trim();
        String Pass = txtPass.getText().trim();

        if (!"".equals(User) || !"".equals(Pass)) {

            try {
                Conexion C = new Conexion();

                C.Conectar(entities.UserPass.User, entities.UserPass.Pass);
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, "Usuario/contrasena erroneo", "Error de autentificacion", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int ID_Usuario = 0;
            String Rol = "";

            try {

                resultado = Conexion.consulta("Select ID_Usuario, Rol_Usuario from Usuario where Nombre_Usuario = '" + User + "' "
                        + " and Contrasena_Usuario = '" + Pass + "' and Estado = " + true);

                while (resultado.next()) {
                    ID_Usuario = resultado.getInt(1);
                    Rol = resultado.getString(2);

                }

            } catch (SQLException ex) {
            }

            if (ID_Usuario == 0) {
                JOptionPane.showMessageDialog(this, "Usuario/contrasena erroneo", "Error de autentificacion", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Principal P = new Principal();
            Principal.setID_Usuario(ID_Usuario);
            P.Iniciar(Rol.trim());
            this.setVisible(false);

            P.setVisible(true);
            P.toFront();

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese usuario y contrasena", "Ingrese", JOptionPane.ERROR_MESSAGE);

        }

    }


    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        char a = evt.getKeyChar();

        if (a == KeyEvent.VK_ENTER) {

            Conectar();

        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtPassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conectar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char a = evt.getKeyChar();

        if (a == KeyEvent.VK_ENTER) {
            txtPass.requestFocus();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioSesion dialog = new InicioSesion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
