package semana3herencia;
/**
 *
 * @author relznd
 */
public class Cliente extends Persona {
    private int id;
    private String tipo;

    public Cliente() {
        this.id =0;
        this.tipo = "";
    }

    public Cliente (String nombre, int cedula, int id, String tipo) {
        super(nombre, cedula);
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 public String toString(){
     return super.toString()+"\nCliente{" + "id="  + id + ", tipo=" + tipo +'}';
 }
    

 
}
