import java.util.Scanner;
public class Ejercicio1 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese un numero: ");
    int edad = entrada.nextInt();
     
    if( edad >= 20 ){
    if( edad <= 50 ){
    System.out.println("El numero esta dentro del rango");
    }
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf