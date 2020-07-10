/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author madri
 */
public class dibujo extends JFrame {
    ArrayList<ArrayList<Integer>> listaAtributos;
    JButton btnDibujar;
    /**
     * Creates new form dibujo
     */
    public dibujo(ArrayList<ArrayList<Integer>> listaAtributos) {
        this.listaAtributos=listaAtributos;
        setSize(1280,720);
        setTitle("NUEVA FLOR!!");
        setLocationRelativeTo(null);
        
        btnDibujar = new JButton("Dibujar");
        btnDibujar.setBounds(620, 10, 20, 5);
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnDibujarActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(ventanaPreSeleccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        // TODO add your handling code here:
        dibujarFlor(listaAtributos);
    }  
 public void dibujarFlor(ArrayList<ArrayList<Integer>> datos){
    int contador=0;
    int ancho= grafico.size().width/3;
    int alto=grafico.size().height/3;
    int finX;
    int finY;
    double numLineas=datos.size()/9;
    double angulo=numLineas/90;
    Graphics graf=grafico.getGraphics();
    for(int i=0; i<9;i++){
        switch(contador){
            case 0:
                for(int j=0;j<numLineas;j++){
                    if(j!=0){
                       finX=ancho-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo)));
                       finY=-2*alto+(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo)));
                    }
                    else{
                        finX=ancho-(int)(datos.get(j).get(1));
                        finY=-2*alto+(int)(datos.get(j).get(1));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(0,0,50,50);
                    System.out.println("SIRVO origenx: "+finX+" origeny: "+finY+" Color: "+datos.get(j).get(0));
                    //graf.drawLine(ancho,-2*alto,finX,finY);
                 }
            case 1:
                for(int j=0;j<numLineas;j++){
                   finX=ancho+(ancho/(int)numLineas)*j;
                   finY=alto-(int)(datos.get(j).get(1));
                   graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                   graf.drawLine((ancho/(int)numLineas)*j, alto,finX,finY);
                }
            case 2:
                for(int j=0;j<numLineas;j++){
                    if(j!=0){
                       finX=2*ancho+(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo)));
                       finY=alto-(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo)));
                    }
                    else{
                        finX=2*ancho+(int)(datos.get(j).get(1));
                        finY=alto-(int)(datos.get(j).get(1));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho, alto,finX,finY);
                 }
            case 3:
                for(int j=0;j<numLineas;j++){
                   finX=ancho-(int)(datos.get(j).get(1));
                   finY=alto+(alto/(int)numLineas)*j;
                   graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                   graf.drawLine(ancho,(alto/(int)numLineas)*j,finX,finY);
                }
            case 4:
                //centro
            case 5:
                for(int j=0;j<numLineas;j++){
                   finX=2*ancho+(int)(datos.get(j).get(1));
                   finY=alto+(alto/(int)numLineas)*j;
                   graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                   graf.drawLine(2*ancho, (alto/(int)numLineas)*j,finX,finY);
                }
            case 6:
                for(int j=0;j<numLineas;j++){
                    if(j!=0){
                       finX=ancho-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo)));
                       finY=3*alto-(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo)));
                    }
                    else{
                        finX=ancho-(int)(datos.get(j).get(1));
                        finY=3*alto-(int)(datos.get(j).get(1));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(ancho, 2*alto,finX,finY);
                 }
            case 7:
                for(int j=0;j<numLineas;j++){
                   finX=ancho+(ancho/(int)numLineas)*j;
                   finY=3*alto-(int)(datos.get(j).get(1));
                   graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                   graf.drawLine((ancho/(int)numLineas)*j, 2*alto,finX,finY);
                }
            case 8:
                for(int j=0;j<numLineas;j++){
                    if(j!=0){
                       finX=3*ancho-(int)(datos.get(j).get(1)*Math.cos(Math.toRadians(angulo)));
                       finY=3*alto-(int)(datos.get(j).get(1)*Math.sin(Math.toRadians(angulo)));
                    }
                    else{
                        finX=3*ancho-(int)(datos.get(j).get(1));
                        finY=3*alto-(int)(datos.get(j).get(1));
                    }
                    graf.setColor(new Color(Color.decode(Integer.toString(datos.get(j).get(0))).getRed(),Color.decode(Integer.toString(datos.get(j).get(0))).getGreen(),Color.decode(Integer.toString(datos.get(j).get(0))).getBlue()));
                    graf.drawLine(2*ancho, 2*alto,finX,finY);
                 }
         }
     contador++;
        System.out.println("sección "+contador);
     }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grafico = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout graficoLayout = new javax.swing.GroupLayout(grafico);
        grafico.setLayout(graficoLayout);
        graficoLayout.setHorizontalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        graficoLayout.setVerticalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jButton1.setText("DIBUJAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(23, 23, 23)
                .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grafico.getAccessibleContext().setAccessibleName("grafico");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
                        dibujarFlor(listaAtributos);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grafico;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
