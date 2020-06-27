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
        public static string nombre1="foto1.jpg";
        public static string nombre2="foto2.jpg";
        public static string nombre3="foto3.jpg";
        
        void Variables(){
            
        }
        void agregarPetalo(petalo nuevo){
            listaPetalo.add(nuevo);
        }
        
        void agregarCentro(centro nuevo){
            listaCentro.add(nuevo);
        }
        
        int ElementosTipoCentro(){
            return listaCentro.size();
        }
        
        int ElementosTipoPetalo(){
            return listaPetalo.size();
        }
        
        void mostrarInfoPetalo(){
            for (petalo Petalo : listaPetalo) {
                Petalo.mostrar();
            }
        }
        
        String getNombre1(){
            return nombre1;
        }
        String getNombre2(){
            return nombre2;
        }
        String getNombre3(){
            return nombre3;
        }
    }
