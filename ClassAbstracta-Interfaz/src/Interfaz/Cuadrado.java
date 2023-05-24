
package Interfaz;

import static java.lang.Math.pow;


public class Cuadrado implements Figura {
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    @Override
    public double area(){
        return pow(lado,2);
    }
}
