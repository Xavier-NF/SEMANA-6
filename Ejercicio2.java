import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese una edad: ");
    int edad = entrada.nextInt();
     
    if( edad >= 18 ){
    System.out.println("Puede obtener licencia de conducir");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf