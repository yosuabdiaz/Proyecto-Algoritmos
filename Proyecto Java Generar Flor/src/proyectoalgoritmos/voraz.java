package proyectoalgoritmos;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soporte
 */
public class voraz {
    int largoEtapa;/*tamanno de las etapas*/
    int Etapas;
    void voraz(){
        /*constructor*/
    }

    void setEtapas(int num){
        Etapas = num;
    }

    void setLargoEtapa(int largo){
        /*tamanno de las etapas */
        largoEtapa = (int)largo/Etapas;
    }
        
    int[] sacarEtapa(int[] subestructura,int inicio){
        int[]nueva = new int[largoEtapa];
        int indice=0;
        for(int i = inicio;i < inicio+largoEtapa;i++){
                /*System.out.println(listaPetalo[j]);*/
                if (i < subestructura.length){
                    nueva[indice] = subestructura[i];
                    indice++;
                }
        }
        return nueva;
    }
    
    void Colores(int[] lista){ /*Sub estructura: arreglo de pixeles */
        setLargoEtapa(lista.length);/*establecer tamanno de la etapa*/
        
        for (int i = 0; i < lista.length; i+=largoEtapa) { 
            /*Sacar Etapa*/
            int[]etapa;
            etapa = sacarEtapa(lista,i);
            
            //System.out.println(listaPetalo.length);
            //System.out.println("largo etapa"+largoEtapa);
            
            hash[] h;
            h = hash.iniciarHash(largoEtapa);
            
            for (int indice = 0;indice < largoEtapa;indice++){
                
                hash.insertaHash(h, largoEtapa, etapa[indice]);
            
            }
            
            int RGB = hash.getMax(h,largoEtapa);
            color c = new color();
            c.setRGB(RGB);
            if (RGB != 0)
                Variables.listaColor.add(c);
        }
        
        
    }
}
