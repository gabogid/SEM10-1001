
package Abstract;

import static java.lang.Math.pow;
import static java.lang.Math.PI;


public class Circulo extends Figura {
    private float radio;

    public Circulo(float radio, float x, float y) {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return PI*pow(radio,2);
    }

    
}
