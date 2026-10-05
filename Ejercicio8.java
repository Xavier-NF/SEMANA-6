import java.util.Scanner;
public class Ejercicio8 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese un sueldo: ");
    int sueldo = entrada.nextInt();
     
    if( sueldo >= 3500 ){
    System.out.println("Ingreso alto");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf