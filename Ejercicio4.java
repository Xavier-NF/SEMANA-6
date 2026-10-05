import java.util.Scanner;
public class Ejercicio4 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese una nota: ");
    int edad = entrada.nextInt();
     
    if( edad >= 17 ){
    System.out.println("Alumno destacado");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf