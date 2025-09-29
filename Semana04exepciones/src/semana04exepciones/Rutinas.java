package semana04exepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author relznd
 */
public class Rutinas {
    
    //Programa que recibe solo numeros pares, si ingresa un impar mostrar error
    public void ejemplo1(){
        int num = Integer.parseInt (JOptionPane.showInputDialog("digite un numero: "));
        try{
            if (num%2==0){
                JOptionPane.showMessageDialog(null, "El numero ingresado es par-");
            } else {
                throw new Exception ("Error, el numero ingresadoe es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ejemplo1();
        }
    
    }
    
    //Validar que solo se ingresen numeros
    public void ejemplo2() {
        int total = 0, n1 = 0, n2 = 0;
        boolean esNum = false;
        
        while (!esNum) {
            try {
                 n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero 1: "));
                 n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero 1: "));
                esNum = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null, "No se permiten letras", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                        
            } finally {
                total = n1 + n2;
            }
            JOptionPane.showMessageDialog(null, "La sumatoria es: "+ total);
        }
        
    }
    
    
    public void ejemplo3() {
        int num[] = {1, 2, 3, 4, 5};
        try { 
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indice fuera de los limites del arreglo");
        } finally {
            System.out.println("Operacion finalizada...");
        }
        
    }
    
}
