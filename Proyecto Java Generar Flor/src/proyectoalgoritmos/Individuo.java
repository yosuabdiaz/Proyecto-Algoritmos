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
public class Individuo {
    private Cromosoma cromosomaColor;
    private Cromosoma cromosomaLargo;

public Individuo(Cromosoma cromosomaColor, Cromosoma cromosomaLargo) {
    this.cromosomaColor = cromosomaColor;
    this.cromosomaLargo = cromosomaLargo;
    }

public Cromosoma getCromosomaColor() {
    return cromosomaColor;
    }

public void setCromosomaColor(Cromosoma cromosomaColor) {
    this.cromosomaColor = cromosomaColor;
    }
public Cromosoma getCromosomaLargo() {
    return cromosomaLargo;
    }

public void setCromosomaLargo(Cromosoma cromosomaLargo) {
    this.cromosomaLargo = cromosomaLargo;
    }
    @Override
public String toString() {
    return "Cromosoma del color: " + cromosomaColor.getNum() +" Cromosoma del largo: " + cromosomaLargo.getNum();
}
}
