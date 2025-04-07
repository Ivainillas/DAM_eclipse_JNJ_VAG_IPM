package ejercicios;
import java.util.Scanner;
public class Extra2_IPM {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        int pagoHorasNormales = horasNormales * 16;
        int pagoHorasExtras = horasExtras * 20;
        int salarioSemanal = pagoHorasNormales + pagoHorasExtras;

        System.out.println("Salario por horas normales (" + horasNormales + "h): " + pagoHorasNormales + " euros");
        System.out.println("Salario por horas extras (" + horasExtras + "h): " + pagoHorasExtras + " euros");
        System.out.println("Salario total semanal: " + salarioSemanal + " euros");

        scanner.close();
    }

}
