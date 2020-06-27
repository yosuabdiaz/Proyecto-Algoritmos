
import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soporte
 */
public class ventanaPreSeleccion extends JFrame implements ActionListener {
    JFrame frmPreSelect;
    JButton btnPetalo;
    JButton btnCentro;
    String foto1;
    public ventanaPreSeleccion(String foto){
        initialize(foto);
    }
    
    private void initialize(String foto) {
        foto1 = foto; 
        frmPreSelect = new JFrame();
        frmPreSelect.setTitle("PETALO O CENTRO");
        frmPreSelect.setBounds(100, 100, 370, 370);
        frmPreSelect.getContentPane().setLayout(null);
        
        
        btnPetalo = new JButton("PETALO");
        btnPetalo.setBounds(130,50,100,30);
        btnPetalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnPetaloActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(ventanaPreSeleccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        frmPreSelect.getContentPane().add(btnPetalo);
        btnCentro = new JButton("CENTRO");
        btnCentro.setBounds(130,0,100,30);
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnCentroActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(ventanaPreSeleccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        frmPreSelect.getContentPane().add(btnCentro);
        frmPreSelect.setVisible(true);
        
    }
    private void btnPetaloActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        // TODO add your handling code here:
        ventanaSeleccion window = new ventanaSeleccion(foto1,1); 
        window.frmSelectAreaIn.setVisible(true);
    }  
    
    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        // TODO add your handling code here:
        ventanaSeleccion window = new ventanaSeleccion(foto1,2); 
        window.frmSelectAreaIn.setVisible(true);
    }  
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}











