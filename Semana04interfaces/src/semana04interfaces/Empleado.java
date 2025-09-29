package semana04interfaces;
/**
 *
 * @author relznd
 */
public class Empleado implements Pagable {
    private String nombre;
    private int id;
    private int base;
    
    
    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double calcularSalario() {
        return base;
    }
    
    public void mostrarDatos(){
        System.out.println("ID: "+ id + ", Nombre: " + nombre);
    }
}
