import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese el monto de la compra: ");
    int edad = entrada.nextInt();
     
    if( edad >= 300 ){
    System.out.println("Tiene un descuento del 10%");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf