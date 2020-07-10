package proyectoalgoritmos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author madri
 */
public class Genotipo {
    private int atributo;
    private int minimo;
    private int maximo;

public Genotipo(int atributo,int minimo,int maximo) {
    this.atributo = atributo;
    this.minimo = minimo;
    this.maximo = maximo;
    }

public int getAtributo() {
    return atributo;
    }

public void setAtributo(int atributo) {
    this.atributo = atributo;
    }
public int getMinimo() {
    return minimo;
    }

public void setMinimo(int minimo) {
    this.minimo = minimo;
    }
public int getMaximo() {
    return maximo;
    }

public void setMaximo(int maximo) {
    this.maximo = maximo;
    }
    @Override
public String toString() {
    return "Genotipo \n Característica: " + atributo +" Rango:\nMinimo: " + minimo +" Máximo: " + maximo;
}
}

