
package Abstract;

import static java.lang.Math.pow;

public class Cuadrado extends Figura {
    private float lado;

    public Cuadrado(float lado, float x, float y) {
        super(x, y);
        this.lado = lado;
    }
    
    @Override
    public double area(){
        return pow(lado,2);
    }
    
    
}
