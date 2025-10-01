package Practica_4.Ejercicio1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		Empleado[] empleados=new Empleado[5];
		
		for(int i=0;i<3;i++) {
			System.out.println("\n---Empleado a Tiempo Completo---");
			System.out.println("nombre: ");
			String nombre=sc.nextLine();
			System.out.println("Salario Anual: ");
			double salarioAnual=sc.nextDouble();
			sc.nextLine();
			
			empleados[i]=new EmpleadoTiempoCompleto(nombre, salarioAnual);			
		}
		for(int i=3;i<5;i++) {
			System.out.println("\n---Empleado a Tiempo Horario---");
			System.out.println("Nombre: ");
			String nombre=sc.nextLine();
			System.out.println("Horas Trabajadas: ");
			double HorasTrabajadas=sc.nextDouble();
			System.out.println("Tarifa por Hora: ");
			double tarifaporHora=sc.nextDouble();
			empleados[i]=new EmpleadoTiempoHorario(nombre, HorasTrabajadas,tarifaporHora);
			sc.nextLine();
		}
		System.out.println("\n--- Información de los empleados ---");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
            System.out.println("Salario mensual: " + emp.CalcularSalarioMensual());
            System.out.println();
        }
        sc.close();
    }
}