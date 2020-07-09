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
        public static int  rgb_colorPredominante = 0;
        public static int  int_maximoContador = 0;

        
        void Variables(){
            
        }
        
        
        void guardarCantidadYColor(int cantidad,int color){
            int cantidadMax = getMaximoContador();
                    if(cantidad > cantidadMax){
                        setMaximoContador(cantidad);
                        setColorPredominante(color);
                    }
        }
        
        void ResetValues(){
            setColorPredominante(0);
            setMaximoContador(0);
        }
        void setColorPredominante(int n){
            rgb_colorPredominante = n;
        }

        int getColorPredominante(){
            return rgb_colorPredominante;        
        }

        void setMaximoContador(int n){
            int_maximoContador = n;
        }

        int getMaximoContador(){
            return int_maximoContador;        
        }

        
        
        
        ArrayList<Integer> sacarArrayColores(){
            ArrayList<Integer> colores = new ArrayList<>();
            
            listaColor.forEach(color -> {
                colores.add(color.getRGB());
            });
            
            return colores;
        }
        ArrayList<Integer> sacarArrayAlturas(){
            ArrayList<Integer> alturas = new ArrayList<>();
            
            listaAltura.forEach(altura -> {
                alturas.add(altura.getSize());
            });
            
            return alturas;
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
