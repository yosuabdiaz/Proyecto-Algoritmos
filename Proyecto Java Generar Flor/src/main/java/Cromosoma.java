/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author madri
 */
public class Cromosoma {
    private int num;

public Cromosoma(int num) {
    this.num = num;
    }

public int getNum() {
    return num;
    }

public void setNum(int num) {
    this.num = num;
    }
    @Override
public String toString() {
    return "Cromosoma número: " + num;
}
}
