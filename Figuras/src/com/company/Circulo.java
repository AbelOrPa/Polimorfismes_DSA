package com.company;

public class Circulo extends Figura{

    private int radio;
    private double area;

    public Circulo (int radio) {
        this.radio = radio;
        area = Math.PI*(radio^2);
    }

    public void setRadio(int r) {

        this.radio = r;

    }

    public int getRadio() {

        return this.radio;

    }

    @Override
    public double area() {
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", area=" + area + '}';
    }
}
