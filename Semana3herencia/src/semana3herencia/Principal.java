/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3herencia;

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
        Cliente c = new Cliente ("Juan", 123, 12, "VIP");
        Vendedor v = new Vendedor("Elena", 234, 31, 350000);
        
        System.out.println("datos del cliente: \n" +c.toString()
                + "\n\nDatos del vendedor: \n" + v.toString());
    }
    
}
