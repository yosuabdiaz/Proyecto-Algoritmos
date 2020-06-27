/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soporte
 */
public class centro {
    int[][] info;
    void centro(){
        
    }
    
    void setMat(int[][] mat){
        info = mat;
    }
            
    int[][] getMat(){
        return info;
    }
    
    void mostrar(){
        for (int row = 0; row < info.length; row++) {
            for (int col = 0; col < info[0].length; col++) {
                    System.out.println(info[row][col]);
	    }           }
    }
}
