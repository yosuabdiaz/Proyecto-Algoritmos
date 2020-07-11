package proyectoalgoritmos;
/**
 *
 * @author Yosua B. Díaz.
 */
public class voraz {
    int largoEtapa;/*tamanno de las etapas*/
    int Etapas; /*total de etapas*/
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
        /*Saca una sublista de datos para la etapa, O(n)*/
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
    
    void Colores(int[] lista){ 
        /*
        -Algoritmo Voraz O(n)
        subestructura: lista de pixeles.
        estapa: sub conjunto de pixeles de la lista de pixeles.
        criterio y optimo: el optimo es el color que mas se repita.
        */
        setLargoEtapa(lista.length);
        for (int i = 0; i < lista.length; i+=largoEtapa) { 
            //barre la lista de pixeles iterando con el largo de la etapa.
            int[]etapa;
            etapa = sacarEtapa(lista,i);//Saca la lista de pixeles para la etapa.  
            hash[] h;
            h = hash.iniciarHash(largoEtapa);
            Variables global = new Variables();
            for (int indice = 0;indice < largoEtapa;indice++){
                //barre la etapa.
                hash.insertaHash(h, largoEtapa, etapa[indice]);
            }
            int RGB = global.getColorPredominante();//toma el valor mas repetido.
            color c = new color();
            c.setRGB(RGB);
            if (RGB != 0)
                Variables.listaColor.add(c);
            
             global.ResetValues();//establece en 0 los contadores para sacar el color mas repetido.
        }
        
        
    }
}
