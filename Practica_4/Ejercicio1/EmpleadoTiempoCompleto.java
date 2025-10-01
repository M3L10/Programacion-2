package Practica_4.Ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado{
	public double salario_anual;
	public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
		super(nombre);
		this.salario_anual=salario_anual;
	}
	public double CalcularSalarioMensual() {
		return salario_anual/12;
	}
	@Override
	public String toString() {
		return super.toString() +", salario_anual= "+salario_anual;
	}
}