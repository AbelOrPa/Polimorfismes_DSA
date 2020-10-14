package com.company;

import com.company.Figura;

public class Cuadrado extends Rectangulo {

    private int i;

    public Cuadrado(int i){
        super(i,i);
    }

    @Override
    public String toString() {
        return "Cuadrado de lado = " + super.getLado1() + " area = " + this.area();
    }
}
