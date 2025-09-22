package semana3herencia;
/**
 *
 * @author relznd
 */
public class Vendedor extends Persona{
    private int codigo;
    private double salario;
    
    public Vendedor(){
        this.codigo = 0;
        this.salario = 0.0d;
    }

    public Vendedor(String nombre, int cedula, int codigo, double salario) {
        super(nombre, cedula);
        this.codigo = codigo;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor{" + "codigo=" + codigo + ", salario=" + salario + '}';
    }
  
    
}
