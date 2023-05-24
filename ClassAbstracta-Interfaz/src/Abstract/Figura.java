
package Abstract;

public abstract class Figura {
    protected double x;
    protected double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    
    
    public abstract double area();
    
     public String mostrarDatos(){
        return "Valor de x: "+x+"\nValor de y: "+y;
    }
}
