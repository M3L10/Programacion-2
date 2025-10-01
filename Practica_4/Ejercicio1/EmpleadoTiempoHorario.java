package Practica_4.Ejercicio1;

public class EmpleadoTiempoHorario extends Empleado{
	public double horas_trabajadas;
	public double tarifa_por_hora;
	public EmpleadoTiempoHorario(String nombre,double h_t,double t_p_h) {
		super(nombre);
		this.horas_trabajadas=h_t;
		this.tarifa_por_hora=t_p_h;
	}
	public double CalcularSalarioMensual() {
		return this.horas_trabajadas*this.tarifa_por_hora;
	}
	@Override
	public String toString() {
	    return super.toString() + ", horas_trabajadas=" + horas_trabajadas + ", tarifa_por_hora=" + tarifa_por_hora;
	}
}