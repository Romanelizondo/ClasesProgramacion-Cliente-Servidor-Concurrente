package semana3herenciapolimorfismo;
/**
 *
 * @author relznd
 */
public abstract class Figuras {
    private String nombre;
    private double area;
    private double perimetro;
    
    public Figuras(){
        this.nombre="";
        
    }

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimetro();
    
    public String toString() {
        return "\nNombre: " + this.getNombre();
    }
}
