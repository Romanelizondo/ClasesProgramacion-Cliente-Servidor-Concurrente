package semana3herencia;
/**
 *
 * @author relznd
 */
public class Persona {
    
    private String nombre;
    private int cedula;

    public Persona() {
        this.nombre = "";
        this.cedula = 0;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
