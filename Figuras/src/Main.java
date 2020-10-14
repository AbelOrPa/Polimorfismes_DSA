import java.util.Arrays;

import com.company.Cuadrado;
import com.company.*;


public class Main {

    public static double suma(Figura[] vec){
        double total = 0;
        for (Figura f : vec) {
            total += f.area();
        }
        return total;
    }
    public static void sort(Figura[] vec){
        Arrays.sort(vec);
    }

    public static void main(String[] args) {
        Figura[] vec = new Figura[4];
        vec[0] = new Rectangulo(1, 6);
        vec[1] = new Triangulo(6, 3);
        vec[2] = new Circulo(5);
        vec[3] = new Cuadrado(4);

        double r = Main.suma(vec);

        System.out.println(r);
        System.out.println(Arrays.asList(vec));
        Main.sort(vec);
        System.out.println(Arrays.asList(vec));
    }
}

