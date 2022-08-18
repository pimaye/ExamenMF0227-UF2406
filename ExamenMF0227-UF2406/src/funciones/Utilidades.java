package funciones;

public class Utilidades {

	/**
	 * Función que dada la nota del alumno/a nos dice si está Suspenso,
	 * Bien, Notable o Sobresaliente.
	 * @param nota: double con la nota del alumno/a.
	 * @return String con la descripción que ha sacado el alumno/a según su nota.
	 * Esta descripción puede ser: 
	 * -Nota menos de 5:Suspenso
	 * -Nota entre 5 y menos de 6.5:Bien
	 * -Nota entre 6.5 y menos de 8.5:Notable
	 * -Nota menos de 10:Sobresaliente
	 */
	

	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}