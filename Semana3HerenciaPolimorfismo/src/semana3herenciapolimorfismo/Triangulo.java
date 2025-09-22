package semana3herenciapolimorfismo;
/**
 *
 * @author relznd
 */
public class Triangulo extends Figuras{
    
    private double base;
    private double altura;

    public Triangulo() {
        this.base=0.0d;
        this.altura=0.0d;
    }

    public Triangulo(double base, double altura) {
        super ("Triangulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double getArea(){
        return (this.base*this.altura) / 2;
    }
    
    @Override
    public double getPerimetro(){
        return this.base + this.base + this.base;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nArea: " + this.getArea()
                +"\nPerimetro: " + this.getPerimetro();
    }
}
