

import javax.swing.JFrame;

import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soporte
 */
public class NewJFrame extends javax.swing.JFrame {
    private JFrame frmSelectAreaIn;
    private JPanel selectedAreaPanel;
    public Variables global;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImagen1 = new javax.swing.JButton();
        btnImagen2 = new javax.swing.JButton();
        btnImagen3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnImagen1.setText("IMAGEN 1");
        btnImagen1.setToolTipText("");
        btnImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen1ActionPerformed(evt);
            }
        });

        btnImagen2.setText("IMAGEN 2");
        btnImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen2ActionPerformed(evt);
            }
        });

        btnImagen3.setText("IMAGEN 3");
        btnImagen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen3ActionPerformed(evt);
            }
        });

        jButton4.setText("GENERAR FLOR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnImagen1)
                    .addComponent(btnImagen2)
                    .addComponent(btnImagen3)
                    .addComponent(jButton4)
                    .addComponent(jLabel1))
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnImagen1)
                .addGap(18, 18, 18)
                .addComponent(btnImagen2)
                .addGap(18, 18, 18)
                .addComponent(btnImagen3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen1ActionPerformed
        // TODO add your handling code here:
     
        ventanaPreSeleccion window = new ventanaPreSeleccion("foto1.jpg"); 
    }//GEN-LAST:event_btnImagen1ActionPerformed

    private void btnImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen2ActionPerformed
        // TODO add your handling code here:
      
        ventanaPreSeleccion window = new ventanaPreSeleccion("foto2.jpg"); 
    }//GEN-LAST:event_btnImagen2ActionPerformed

    private void btnImagen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen3ActionPerformed
        // TODO add your handling code here:
    
        ventanaPreSeleccion window = new ventanaPreSeleccion("foto3.jpg"); 
    }//GEN-LAST:event_btnImagen3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     
        System.out.println("Centros:"+global.ElementosTipoCentro());
        System.out.println("Petalos:"+global.ElementosTipoPetalo());
        global.mostrarInfoPetalo();
    }//GEN-LAST:event_jButton4ActionPerformed

    
     
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImagen1;
    private javax.swing.JButton btnImagen2;
    private javax.swing.JButton btnImagen3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
