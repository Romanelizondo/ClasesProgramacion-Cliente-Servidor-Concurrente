package semana04interfaces;
/**
 *
 * @author relznd
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp[]=Empleado[2];
        emp[0]= new EmpleadoAsalariado("Ana Torres", 101, 3500);
        emp[1]= new EmpleadoPorHora("Juan Gomez", 102, 15.50, 160);
        
        for (int i = 0; i < emp.length; i++) {
            emp[i].mostrarDatos();
            System.out.println("Salario: $"+emp[i].calcularSalario());
        }
        
    }
    
}
