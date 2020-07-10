/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ventanaNuevaFlor extends JFrame{
    JFrame ventana;
    ArrayList<ArrayList<Integer>> listaAtributos;
    JButton btnDibujar;

    public ventanaNuevaFlor(ArrayList<ArrayList<Integer>> listaAtributos) {
        this.listaAtributos = listaAtributos;
        initialize();
        
    }
    private void initialize() {
        ventana = new JFrame();
        ventana.setSize(1280,720);
        ventana.setTitle("NUEVA FLOR!!");
        ventana.getContentPane().setLayout(null);
        
        btnDibujar = new JButton("Dibujar");
        btnDibujar.setBounds(620, 10, 20, 5);
        btnDibujar.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                btnDibujarActionPerformed(evt);
            } catch (IOException ex) {
                Logger.getLogger(ventanaNuevaFlor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        ventana.getContentPane().add(btnDibujar);
    }
    public void dibujarFlor(ArrayList<ArrayList<Integer>> datos){
    int contador=0;
    int ancho= ventana.size().width/3;
    int alto=ventana.size().height/3;
    int finX;
    int finY;
    double numLineas=datos.size()/9;
    double angulo=numLineas/90;
    Graphics graf=ventana.getGraphics();
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
                    graf.drawLine(ancho,-2*alto,finX,finY);
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
     private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        // TODO add your handling code here:
        dibujarFlor(listaAtributos);
    }  
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    }
