import java.util.*;
import java.io.*;

public class EjemploExcepciones {
    public static void main(String args[]) throws FileNotFoundException{
        try {
            File archivo = new File("Entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.println("Dame el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Dame el segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.print("La division es: " + num1 / num2);
        }
        catch(ArithmeticException excepcionAritmetica) {
            System.out.println("Division por cero");
        }
        catch(InputMismatchException excepcionEntrada) {
            System.out.println("Entrada incorrecta");
        }
        /*catch(FileNotFoundException excepcionArchivo) {
            System.out.println("NO existe el archivo");
        }*/
    }
}
