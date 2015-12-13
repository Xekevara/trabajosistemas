import java.util.*;
public class Ejercicio3 {
    public void dibujarCuadrado(int n) {
        //Fila superior
        System.out.print("+");
        for (int guiones=1; guiones<=(n-2); guiones++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        //filas intermedias.
        for (int filas=1; filas<=(n-2); filas++) {                      
            System.out.print("|");
            for (int espacios=1; espacios<=(n-2); espacios++) {
                System.out.print(" ");
            }
            System.out.println("|");
            
        }
                
        //fila inferior. Igual que la superior
        System.out.print("+");

        for (int guiones=1; guiones<=(n-2); guiones++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public void run(){
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        numero = Integer.parseInt(in.nextLine());
        dibujarCuadrado(numero);
    }
    public static void main(String[] args){
        new Ejercicio3().run();
    }
}
