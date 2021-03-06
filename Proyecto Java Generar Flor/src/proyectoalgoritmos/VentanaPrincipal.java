package proyectoalgoritmos;



import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class VentanaPrincipal extends javax.swing.JFrame {
    private JFrame frmSelectAreaIn;
    private JPanel selectedAreaPanel;
    ArrayList<ArrayList<Integer>> listaAtributosFinales=new ArrayList();
    ArrayList<Individuo> poblacionFinal;
    Genetico genetico;
    /**
     * Creates new form NewJFrame
     */
    public VentanaPrincipal() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImagen1 = new javax.swing.JButton();
        btnImagen2 = new javax.swing.JButton();
        btnImagen3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        grafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Principal");

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

        jButton1.setText("GENERAR FLOR");
        jButton1.setName("btnGenerarFlor"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnContinuar.setText("Siguiente Generación");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImagen1)
                    .addComponent(jLabel1)
                    .addComponent(btnImagen2)
                    .addComponent(btnImagen3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImagen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImagen2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImagen3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContinuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReiniciar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleDescription("");

        grafico.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout graficoLayout = new javax.swing.GroupLayout(grafico);
        grafico.setLayout(graficoLayout);
        graficoLayout.setHorizontalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        graficoLayout.setVerticalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 288, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
        ventanaPreSeleccion window = new ventanaPreSeleccion("foto3.png"); 
    }//GEN-LAST:event_btnImagen3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        voraz VorazColores = new voraz();
        VorazColores.setEtapas(Variables.Etapas);
        
        
        Variables.listaPetalo.forEach(Petalo -> {
        int[] listaPetalos = Petalo.getListaPixeles();/*Retorna una lista de pixeles del <petalo>*/
            VorazColores.Colores(listaPetalos); /*Algoritmo Voraz*/
        });
        
        Variables.listaCentro.forEach(Centro -> {
        int[] listaCentros = Centro.getListaPixeles();/*Retorna una lista de pixeles del <centro>*/
            VorazColores.Colores(listaCentros); /*Algoritmo Voraz*/
        });
        
        
        Variables global = new Variables();
        global.mostrarInfoAltura();
        
        genetico=new Genetico(global.sacarArrayColores(),global.sacarArrayAlturas());
        genetico.generarGenotipoLargo();
        genetico.generarGenotipoColores();
        poblacionFinal=genetico.generarPoblacionInicial();
        poblacionFinal=genetico.generacion(1, poblacionFinal);
        for(int i=0;i<poblacionFinal.size();i++){
            listaAtributosFinales.add(genetico.determinarGenotipo(poblacionFinal.get(i)));
        }
        System.out.println(listaAtributosFinales);
        dibujarFlor(listaAtributosFinales);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        grafico.repaint();
        listaAtributosFinales.clear();
        poblacionFinal.clear();
        btnContinuar.disable();
        btnReiniciar.disable();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        poblacionFinal=genetico.generacion(1, poblacionFinal);
        for(int i=0;i<poblacionFinal.size();i++){
            listaAtributosFinales.add(genetico.determinarGenotipo(poblacionFinal.get(i)));
        }
        System.out.println(listaAtributosFinales);
        dibujarFlor(listaAtributosFinales);
        btnReiniciar.enable();
    }//GEN-LAST:event_btnContinuarActionPerformed

    public void dibujarFlor(ArrayList<ArrayList<Integer>> datos){
    int contador=0;
    int c=0;
    int ancho= grafico.size().width/3;
    int alto=grafico.size().height/3;
    int finX;
    int finY;
    int numLineas=datos.size()/9;
    double angulo=(double)90/numLineas;
    Graphics graf=grafico.getGraphics();
    for(int i=0; i<9;i++){
        switch(contador){
            case 0:
                for(int j=0;j<numLineas;j++){
                    if(j!=0){
                       finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*7*numLineas/8)))-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*j)));
                       finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*7*numLineas/8)))+(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*j)));
                    }
                    else{
                        finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*7*numLineas/8)))-(int)(datos.get(j).get(1));
                        finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*7*numLineas/8)));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*7*numLineas/8))),alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*7*numLineas/8))),finX,finY);
                    //graf.drawLine(ancho,-2*alto,finX,finY);
                 }
            case 1:
                c=0;
                for(int j=numLineas;j<numLineas*2;j++){
                    finX=ancho+(ancho/2)-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*(c+numLineas/2))));
                    finY=2*alto+(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*(c+numLineas/2))));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2), 2*alto,finX,finY); 
                    c++;
                 }
            case 2:
                c=0;
                for(int j=numLineas*2;j<numLineas*3;j++){
                    if(j!=numLineas*2){
                       finX=(ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*5*numLineas/8))))+(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*c)));
                       finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*5*numLineas/8)))+(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*c)));
                    }
                    else{
                        finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*5*numLineas/8)))+(int)(datos.get(j).get(1));
                        finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*5*numLineas/8)));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*5*numLineas/8))),alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*5*numLineas/8))),finX,finY); 
                 c++;
                }
            case 3:
                c=0;
                for(int j=numLineas*3;j<numLineas*4-(numLineas/2);j++){
                    finX=ancho+((ancho-alto)/2)-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*(c-numLineas/2))));
                    finY=alto+(alto/2)+(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*(c-numLineas/2))));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+((ancho-alto)/2), alto+(alto/2),finX,finY); 
                    c++;
                 }
                for(int k=numLineas*4-(numLineas/2);k<numLineas*4;k++){
                    finX=ancho+((ancho-alto)/2)-(int)(datos.get(k).get(1)*Math.cos(Math.toRadians(angulo*(c-numLineas/2))));
                    finY=alto+(alto/2)+(int)(datos.get(k).get(1)*Math.sin(Math.toRadians(angulo*(c-numLineas/2))));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(k).get(0))).getRed(),Color.decode(Integer.toString(datos.get(k).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(k).get(0))).getBlue()));
                    graf.drawLine(ancho+((ancho-alto)/2), alto+(alto/2),finX,finY); 
                    c++;
                 }
            case 4:
                c=0;
                for(int j=numLineas*4;j<numLineas*5;j++){
                    finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*c)));
                    finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*c)));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2), alto+(alto/2),finX,finY);
                    c++;
                 }
            case 5:
                c=0;
                for(int j=numLineas*5;j<numLineas*6-(numLineas/2);j++){
                    finX=2*ancho-((ancho-alto)/2)+(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*(c-numLineas/2))));
                    finY=alto+(alto/2)+(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*(c-numLineas/2))));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(2*ancho-((ancho-alto)/2), alto+(alto/2),finX,finY); 
                    c++;
                 }
                for(int k=numLineas*6-(numLineas/2);k<numLineas*6;k++){
                    finX=2*ancho-((ancho-alto)/2)+(int)(datos.get(k).get(1)*Math.cos(Math.toRadians(angulo*(c-numLineas/2))));
                    finY=alto+(alto/2)+(int)(datos.get(k).get(1)*Math.sin(Math.toRadians(angulo*(c-numLineas/2))));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(k).get(0))).getRed(),Color.decode(Integer.toString(datos.get(k).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(k).get(0))).getBlue()));
                    graf.drawLine(2*ancho-((ancho-alto)/2), alto+(alto/2),finX,finY); 
                    c++;
                 }
            case 6:
                c=0;
                for(int j=numLineas*6;j<numLineas*7;j++){
                    if(j!=numLineas*6){
                       finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*numLineas/8)))-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*c)));
                       finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*numLineas/8)))-(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*c)));
                    }
                    else{
                        finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*numLineas/8)))-(int)(datos.get(j).get(1));
                        finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*numLineas/8)));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*numLineas/8))),alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*numLineas/8))),finX,finY);
                    c++;
                }
            case 7:
                c=0;
                for(int j=numLineas*7;j<numLineas*8;j++){
                    finX=ancho+(ancho/2)-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*(c+numLineas/2))));
                    finY=alto-(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*(c+numLineas/2))));
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2), alto,finX,finY); 
                c++; 
                }
            case 8:
                c=0;
                for(int j=numLineas*8;j<numLineas*9;j++){
                    if(j!=numLineas*8){
                       finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*3*numLineas/8)))+(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo*c)));
                       finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*3*numLineas/8)))-(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo*c)));
                    }
                    else{
                        finX=ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*3*numLineas/8)))+(int)(datos.get(j).get(1));
                        finY=alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*3*numLineas/8)));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho+(ancho/2)-(int)(alto/2*Math.cos(Math.toRadians(angulo*4*3*numLineas/8))),alto+(alto/2)-(int)(alto/2*Math.sin(Math.toRadians(angulo*4*3*numLineas/8))),finX,finY);
                c++; 
                }
         }
     contador++;
        System.out.println("sección "+contador);
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        new VentanaPrincipal().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnImagen1;
    private javax.swing.JButton btnImagen2;
    private javax.swing.JButton btnImagen3;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JPanel grafico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
