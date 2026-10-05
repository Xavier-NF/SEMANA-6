import java.util.Scanner;
public class Ejercicio7 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese una temperatura: ");
    int temperatura = entrada.nextInt();
     
    if( temperatura >= 35 ){
    System.out.println("Temperatura extrema");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf