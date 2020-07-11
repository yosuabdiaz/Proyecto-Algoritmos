package proyectoalgoritmos;
/**
 *
 * @author Yosua B. Díaz.
 */
public class hash {
    int dato; // RGB del color.
    int estado; //0 = Vacío, 1 = Eliminado, 2 = Repetido.
    int cantidad; //veces aparecido.
    
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
        int j = funcion(-1*n, m);
        Variables global= new Variables(); 
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                //nuevo color.
                h[j].dato = n;
                h[j].estado = 2;
                h[j].cantidad = 1;
                i = true;
                global.guardarCantidadYColor(h[j].cantidad, n);
            } else {
                if (h[j].dato == n){
                    //color repetido.
                    h[j].cantidad = h[j].cantidad+1;
                    i = true;
                    global.guardarCantidadYColor(h[j].cantidad, n);
                }else{
                    //campo ocupado con color diferente.
                    j++;
                }
            }
        } while (j < m && !i);   
    }
}
