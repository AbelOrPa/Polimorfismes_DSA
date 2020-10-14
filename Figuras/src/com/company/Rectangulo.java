package com.company;

public class Rectangulo extends Figura {

    private int lado1;
    private int lado2;
    private int area;

    public Rectangulo (int l1, int l2){
        this.lado1=l1;
        this.lado2=l2;
        area = l1*l2;
    }

    public int getLado1 () {

        return lado1;
    }

    public int getLado2 () {

        return lado2;

    }

    public void setLado1 (int l1) {

        this.lado1 = l1;

    }

    public void setLado2 (int l2) {

        this.lado2 = l2;

    }


    @Override
    public double area() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area + '}';
    }
}
