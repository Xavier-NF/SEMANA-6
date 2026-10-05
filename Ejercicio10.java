import java.util.Scanner;
public class Ejercicio10 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese nota de Matematica: ");
    int nota1 = entrada.nextInt();
    System.out.print("Ingrese nota de Comunicacion: ");
    int nota2 = entrada.nextInt();
     
    if( nota1 >= 11 && nota2 >= 11 ){
    System.out.println("Postulante apto");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf