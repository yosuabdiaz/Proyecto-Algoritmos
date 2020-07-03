/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList; 
/**
 *
 * @author soporte
    */
    public class Variables {
        public static ArrayList<petalo> listaPetalo = new ArrayList<petalo>(); 
        public static ArrayList<centro> listaCentro = new ArrayList<centro>();       
        public static int Etapas = 9; /*etapas para el voraz*/
        public static ArrayList<color>  listaColor = new ArrayList<color>();
        public static ArrayList<altura> listaAltura = new ArrayList<altura>();
        void Variables(){
            
        }
        
        void agregarAltura(altura nuevo)
        {
            if (nuevo.size!=0)
                listaAltura.add(nuevo);
        }
        void agregarColor(color nuevo){
            listaColor.add(nuevo);
        }  
        
        void mostrarColores(){
           listaColor.forEach(colorI -> {
                colorI.mostrarColor();
           });
        }
        
        void agregarPetalo(petalo nuevo){
            listaPetalo.add(nuevo);
        }
        
        void agregarCentro(centro nuevo){
            listaCentro.add(nuevo);
        }
        
        int ElementosTipoAltura(){
            return listaAltura.size();
        }
        
        int ElementosTipoCentro(){
            return listaCentro.size();
        }
        
        int ElementosTipoPetalo(){
            return listaPetalo.size();
        }
        
        void mostrarInfoPetalo(){
            listaPetalo.forEach(Petalo -> {
                Petalo.mostrar();
            });
        }
        
        int ElementosTipoColor(){
            return listaColor.size();
        }
        
        void mostrarInfoAltura(){
            listaAltura.forEach(altura -> {
                altura.mostrar();
            });
        }
        
        
 
    }
