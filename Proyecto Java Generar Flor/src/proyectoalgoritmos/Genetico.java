package proyectoalgoritmos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author madri
 */
public class Genetico {
    private ArrayList<Integer> listaColores;
    private ArrayList<Integer> listaLargos;
    private ArrayList<Individuo> listaIndividuosFinales=new ArrayList();
    private ArrayList<Genotipo> listaGenotiposColores=new ArrayList();
    private ArrayList<Genotipo> listaGenotiposLargos=new ArrayList();
    public int contadorAptos;
    Random random = new Random(); 
    int numeroR;
    
public Genetico(ArrayList listaColores, ArrayList listaLargos) {
        this.listaColores = listaColores ;
        this.listaLargos = listaLargos ;
    }

public void generarGenotipoColores(){
    double contador=1;
    double largoLista=listaColores.size();
    double max=-1;
    double min=0;
    for(int i=0;listaColores.size()>i;i++){
        int dato=listaColores.get(i);
        contador=1;
        min=0;
        for(int j=i+1; listaColores.size()>j; j++ ){
            if (dato==listaColores.get(j)){
                listaColores.remove(j);
                contador++;
            }
        }
        double parteGen=contador/largoLista*65536;
        min=max+1;
        max=min+parteGen-1;
        Genotipo gen=new Genotipo(dato ,(int)Math.rint(min),(int)Math.rint(max));
        listaGenotiposColores.add(gen);
    }
    }

public void generarGenotipoLargo(){
    double contador=1;
    double largoLista=listaLargos.size();
    double max=-1;
    double min=0;
    for(int i=0;listaLargos.size()>i;i++){
        int dato=listaLargos.get(i);
        contador=1;
        min=0;
        for(int j=i+1; listaLargos.size()>j; j++ ){
            if (dato==listaLargos.get(j)){
                listaLargos.remove(j);
                contador++;
            }
        }
        double parteGen=contador/largoLista*65536;
        min=max+1;
        max=min+parteGen-1;
        Genotipo gen=new Genotipo(dato ,(int)Math.rint(min),(int)Math.rint(max));
        listaGenotiposLargos.add(gen);
    }
        numeroR= random.nextInt(listaGenotiposLargos.size());
    }

public ArrayList<Integer> determinarGenotipo(Individuo individuo){
    ArrayList atributos= new ArrayList();
    int numAtributo; 
    for(int i=0;listaGenotiposColores.size()>i;i++){
        if(individuo.getCromosomaColor().getNum()>=listaGenotiposColores.get(i).getMinimo() && individuo.getCromosomaColor().getNum()<=listaGenotiposColores.get(i).getMaximo()){
           numAtributo=listaGenotiposColores.get(i).getAtributo();
           atributos.add(numAtributo);
           break;
        }   
    }
    for(int i=0;listaGenotiposLargos.size()>i;i++){
        if(individuo.getCromosomaLargo().getNum()>=listaGenotiposLargos.get(i).getMinimo() && individuo.getCromosomaLargo().getNum()<=listaGenotiposLargos.get(i).getMaximo()){
           numAtributo=listaGenotiposLargos.get(i).getAtributo();
           atributos.add(numAtributo);
           break;
        }   
    }
    return atributos; //Devuelve una lista (color,largo)
}

public ArrayList<Individuo> generarPoblacionInicial(){
    ArrayList poblacionInicial= new ArrayList();
    for(int i=0; i<25;i++){
        Random random = new Random(); 
        int numeroRandomColor= random.nextInt(65536);
        Cromosoma cromoColor= new Cromosoma(numeroRandomColor);
         
        int numeroRandomLargo= random.nextInt(65536);
        Cromosoma cromoLargo= new Cromosoma(numeroRandomLargo);
        
        Individuo linea = new Individuo(cromoColor, cromoLargo);
        poblacionInicial.add(linea);
    }
    return poblacionInicial;
}
public ArrayList<Individuo> generacion(int numeroGeneraciones,ArrayList<Individuo> poblacion){
    ArrayList<Individuo> aptos=fitnessPoblacion(poblacion);
    listaIndividuosFinales.addAll(aptos);
    System.out.println("poblacion ini: "+aptos.size()+" "+listaIndividuosFinales.size());
    for(int k=0;k<numeroGeneraciones;k++){
        aptos.clear();
        aptos=crearGeneracion(listaIndividuosFinales);
        aptos=fitnessPoblacion(aptos);
        listaIndividuosFinales.addAll(aptos);
        for(int i=0;i<listaIndividuosFinales.size();i++){
        }
        
    }
    return listaIndividuosFinales;
}
public ArrayList<Individuo> fitnessPoblacion(ArrayList<Individuo> poblacion){
    ArrayList poblacionAptos= new ArrayList();
    double num;
    for(int i=0; poblacion.size()>i; i++){
        String numCadena= String.valueOf(determinarGenotipo(poblacion.get(i)).get(0));
        double rojo=Color.decode(numCadena).getRed();
        double verde=Color.decode(numCadena).getGreen();
        double azul=Color.decode(numCadena).getBlue();
        if (rojo > verde) {
            if (rojo > azul) {
                num=rojo/255;
            } else {
                num=azul/255;    
            }
        } else if (verde > azul) {
            num=verde/255;
        } else {
            num=azul/255;
        }
        Random random = new Random(); 
        for(int j=0; j<listaLargos.size(); j++){
            double num2=determinarGenotipo(poblacion.get(i)).get(1)/listaGenotiposLargos.get(numeroR).getAtributo();
            if(num2>0.4 && num2<2){
                if(num>0.6){
                    contadorAptos+=1;
                    poblacionAptos.add(poblacion.get(i)); 
                    j=listaLargos.size();
                }
                }
        }
    }
    return poblacionAptos;

}

public ArrayList crearGeneracion(ArrayList<Individuo> poblacion){
    
    ArrayList cromosomasPadre= new ArrayList();
    ArrayList cromosomasMadre= new ArrayList();
    ArrayList<Integer> cromosomasHijo= new ArrayList();
    ArrayList hijos= new ArrayList();
    for(int j=0;j<100;j++){
        Random random = new Random(); 
        //Se crea el padre
        int numero1= random.nextInt(poblacion.size());
        Individuo padre =poblacion.get(numero1);
        String cromoColor =sacarNumBinario(padre.getCromosomaColor().getNum());
        cromosomasPadre.add(cromoColor);
        System.out.println("Crmosoma padre: "+cromoColor+" "+padre.getCromosomaColor().getNum());
        String cromoLargo =sacarNumBinario(padre.getCromosomaLargo().getNum());
        cromosomasPadre.add(cromoLargo);
        //Se crea la madre
        int numero2= random.nextInt(poblacion.size());
        Individuo madre =poblacion.get(numero2);
        String cromoColorM =sacarNumBinario(madre.getCromosomaColor().getNum());
        cromosomasMadre.add(cromoColorM);
        String cromoLargoM =sacarNumBinario(madre.getCromosomaLargo().getNum());
        cromosomasMadre.add(cromoLargoM);
        //Combinación de genes
        cromosomasHijo=combinarCromosomas(cromosomasPadre,cromosomasMadre);
        Cromosoma cromosomaHijoColor=new Cromosoma( cromosomasHijo.get(0));
        Cromosoma cromosomaHijoLargo=new Cromosoma( cromosomasHijo.get(1));
        Individuo hijo=new Individuo(cromosomaHijoColor,cromosomaHijoLargo);
        hijos.add(hijo);
        cromosomasPadre.clear();
        cromosomasMadre.clear();
        cromosomasHijo.clear();
                
        
    }
    return hijos;
}
public ArrayList<Integer> combinarCromosomas(ArrayList<String> cromoPadre, ArrayList<String> cromoMadre){
    ArrayList cromosomasHijo= new ArrayList();
    Random random = new Random(); 
    for(int i=0;i<2;i++){
        int puntoCruce= random.nextInt(15);
        String parteCromosomaP= cromoPadre.get(i).substring(0, puntoCruce);
        System.out.println("Padr com: "+parteCromosomaP);
        String parteCromosomaM= cromoPadre.get(i).substring(puntoCruce, 15);
        System.out.println("madr com: "+parteCromosomaM);
        String cromosomaHijo= parteCromosomaP+parteCromosomaM;
        System.out.println("Cromo hijo: "+cromosomaHijo);
        //Mutación
        int porcentaje= random.nextInt(100);
        if(porcentaje<=5){
            System.out.println("MUTACION");
            int bitMutacion= random.nextInt(15);
            char bit= cromosomaHijo.charAt(bitMutacion);
            if(bit==1){
                cromosomaHijo=cromosomaHijo.substring(0, bitMutacion)+'0'+cromosomaHijo.substring(bitMutacion+1);
            }
            else{
                cromosomaHijo=cromosomaHijo.substring(0, bitMutacion)+'1'+cromosomaHijo.substring(bitMutacion+1);
            }

        }
        int num=Integer.parseInt(cromosomaHijo,2);
        cromosomasHijo.add(num);
    }
return cromosomasHijo;
}
public String sacarNumBinario(int numDecimal){
    String numero=Integer.toBinaryString(numDecimal);
    if(numero.length()<16){
        int bitFaltantes=16-numero.length();
        for(int j=0; j<bitFaltantes;j++){
            numero="0"+numero;
        }
    }
return numero;
}
}
