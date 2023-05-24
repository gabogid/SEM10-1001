
package Interfaz;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Circulo implements Figura{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    @Override
    public double area(){
        return PI * pow(radio,2);
    }
}
