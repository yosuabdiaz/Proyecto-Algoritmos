/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soporte
 */
public class hash {
    int dato;
    int estado; //0 = Vacío, 1 = Eliminado, 2 = Ocupado
    int cantidad;
    
    static int funcion(int n, int m) {
        return ((n + 1) % m);
    }
    
    static hash[] iniciarHash(int largo){
        hash[] h = new hash[largo];
        for (int x = 0; x < largo; x++) {
            h[x] = new hash();
            h[x].estado = 0;
        }
        return h;
    }

    static void insertaHash(hash[] h, int m, int n) {
        boolean i = false;
        //boolean s = false;
        int j = funcion(-1*n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                h[j].cantidad = 1;
                i = true;
            } else {
                if (h[j].dato == n){
                    h[j].cantidad = h[j].cantidad+1;
                    i = true;
                    //s = true;
                }else{
                    j++;
                }
            }
        } while (j < m && !i);
        /*if (i) {
            //System.out.println("insertado");
            //if(s)
                //System.out.println();
        } else {
            System.out.println("llena");
        }*/
    }

    static int buscaHash(hash[] h, int m, int n) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0) {
                return -1;
            } else if (h[j].dato == n) {
                if (h[j].estado == 1) {
                    return -1;
                } else {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }

    static int eliminaHash(hash[] h, int m, int n) {
        int i = buscaHash(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            return 1;
        }
    }
    
    static int getMax(hash[] h,int largoEtapa){
        int mayor=0;
        int color=0;
        int temporal;
        for (int x = 0; x < largoEtapa; x++) {
                
                temporal = h[x].cantidad;
               
                if (temporal > mayor){
                    mayor = temporal;
                    color = h[x].dato;
                }
            }
        return color;
    }
}
