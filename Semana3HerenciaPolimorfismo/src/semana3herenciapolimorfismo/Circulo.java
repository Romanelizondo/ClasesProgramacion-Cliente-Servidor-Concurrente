package semana3herenciapolimorfismo;
/**
 *
 * @author relznd
 */
public class Circulo extends Figuras{
    
    private double radio;
    public Circulo(){
        this.radio = 0.0d;
    }

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    public double getPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    
        
@Override
    public String toString(){
        return super.toString()
                +"\nArea: " + this.getArea()
                +"\nPerimetro: " + this.getPerimetro();
    }
}
