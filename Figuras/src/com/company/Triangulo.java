package com.company;

public class Triangulo extends Figura{

    private int base;
    private int altura;
    private int area;


    public Triangulo (int base, int h){
        this.base = base;
        this.altura = h;
        area = (base * altura)/2;

    }

    public int getAltura() {
        return altura;
    }

    public int getCateto3() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int cateto3) {
        this.base = cateto3;
    }


    @Override
    public double area() {
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + '}';
    }
}
