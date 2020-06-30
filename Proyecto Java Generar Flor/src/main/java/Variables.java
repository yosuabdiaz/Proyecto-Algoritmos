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
            listaPetalo.forEach(Petalo -> {
                Petalo.mostrar();
            });
        }
 
    }
