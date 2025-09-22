package semana3herenciapolimorfismo;

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
        Figuras f[]= new Figuras [4];
        f[0]= new Cuadrado(12);
        f[1]= new Circulo(3);
        f[2]= new Circulo (7);
        f[3]= new Triangulo (10,2);

    for (int i = 0; i < f.length; i++){
    System.out.println("---------\n"
                +f[i]
                +"\n---------");
}
    }
    
}
