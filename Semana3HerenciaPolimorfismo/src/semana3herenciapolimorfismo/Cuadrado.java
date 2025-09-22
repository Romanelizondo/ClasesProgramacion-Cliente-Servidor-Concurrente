package semana3herenciapolimorfismo;
/**
 *
 * @author relznd
 */
public class Cuadrado extends Figuras{
    
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado"); //nombre para el cuadrado
        this.lado = lado;
    }
    
    @Override
    public double getArea(){
        return this.lado * this.lado;
    }
    @Override
    public double getPerimetro(){
        return this.lado * 4;
    }
    @Override
    public String toString(){
        return super.toString()
                +"\nArea: " + this.getArea()
                +"\nPerimetro: " + this.getPerimetro();
    }
}
