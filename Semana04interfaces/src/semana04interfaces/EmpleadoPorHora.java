package semana04interfaces;

public class EmpleadoPorHora extends Empleado implements Pagable{
    
    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoPorHora (String nombre, int id, double tarifaHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario() {
        return tarifaHora * horasTrabajadas;
    }
}
