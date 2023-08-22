package arreglos;

import java.util.*;

/***
 * 
 * Este es un programa que tiene como objetivo entender el concepto o estructura de datos de 
 * los arreglos en combinación de la programación orientada a objetos.
 * 
 * 
 * Explicación del programa:
 * 
 * Básicamente es un programa que recorre los distintos arreglos dependiendo del alumno que se elija, 
 * en ese caso se realizaran diferentes tipos de acciones para evaluar las calificaciones o manipularlas. 
 * 
 * 
 * 
 * @author Julio Cesar Morales sierra
 * 
 * */

public class Ejecutar {
	public static void main(String[] args) {

		float[] alumno1 = { 10.0f, 8.0f, 9.5f, 3.2f, 7.3f, 8.5f, 9.6f, 10.0f, 9.7f, 8.4f };
		float[] alumno2 = { 7.0f, 8.0f, 2.0f, 4.0f, 5.8f, 9.0f, 7.7f, 5.3f, 10.0f, 8.8f };
		float[] alumno3 = { 7.8f, 7.8f, 10.0f, 9.8f, 2.0f, 3.5f, 7.0f, 4.4f, 6.0f, 10.0f };
		float[] alumno4 = { 8.0f, 9.0f, 4.0f, 3.7f, 4.0f, 6.6f, 10.0f, 9.0f, 7.0f, 8.3f };
		float[] alumno5 = { 10.0f, 7.0f, 5.5f, 6.6f, 8.0f, 10.0f, 3.3f, 9.8f, 7.3f, 8.6f };
		float[] alumno6 = { 4.4f, 9.0f, 5.0f, 7.7f, 8, 7f, 10.0f, 9.3f, 3.9f, 5.5f, 8.3f };
		float[] alumno7 = { 9.0f, 4.5f, 8.3f, 5.3f, 8.0f, 8.8f, 7.9f, 10.0f, 7.2f, 2.5f };
		float[] alumno8 = { 8.6f, 9.5f, 3.3f, 6.8f, 9.7f, 6.9f, 9.3f, 8.7f, 9.6f, 4.5f };
		float[] alumno9 = { 4.8f, 8.1f, 7.9f, 5.8f, 7.2f, 3.3f, 9.1f, 7.0f, 8.0f, 6.0f };
		float[] alumno10 = { 8.8f, 7.0f, 9.6f, 8.1f, 6.8f, 9, 4f, 9.7f, 7.5f, 9.8f, 9.9f };

		System.out.println("\n***LISTA DE ALUMNOS*** ");
		
		//Muestra la lista de alumnos
		for (int i = 1; i < 11; i++) {
			System.out.println("Alumno " + i);
		}

		try (Scanner entrada = new Scanner(System.in)) {

			System.out.print("\nIngresa el numero del alumno que quieras conocer: ");

			int numero = entrada.nextInt();
			float[] alumno = { 0 };
			int indiceBorrar;
			float calificacion;
			int IndiceUno;
			int IndiceDos;
			boolean bandera = true;
			
			//Selecciona el alumno dependiendo el caso

			if (numero == 1) {
				alumno = alumno1;
			} else if (numero == 2) {
				alumno = alumno2;
			} else if (numero == 3) {
				alumno = alumno3;
			} else if (numero == 4) {
				alumno = alumno4;
			} else if (numero == 5) {
				alumno = alumno5;
			} else if (numero == 6) {
				alumno = alumno6;
			} else if (numero == 7) {
				alumno = alumno7;
			} else if (numero == 8) {
				alumno = alumno8;
			} else if (numero == 9) {
				alumno = alumno9;
			} else if (numero == 10) {
				alumno = alumno10;
			} else {
				System.out.println("Alumno no encontrado");
				bandera = false;
			}
			
			if(bandera) {
				
				TDAArreglo tda = new TDAArreglo(alumno); // Se crea un nuevo objeto

				tda.promedio();
				tda.Moda();
				tda.calificacionMayor();
				tda.calificacionMenor();
				tda.Rango();
				tda.MostrarLista();

				System.out.println("******BUSCAR CALIFICACION*****");
				System.out.println("Ingrese la calificacion que buscas: ");
				calificacion = entrada.nextFloat();
				System.out.println("La calificacion esta en la posicion: " + (tda.buscar(calificacion) + 1));
				tda.MostrarLista();

				System.out.println("******ELIMINAR CALIFICACION******");
				System.out.print("Ingrese la posicion de la calificacion a eliminar: ");
				indiceBorrar = entrada.nextInt();
				tda.borrar(indiceBorrar);
				tda.MostrarLista();

				System.out.println("*****INTERCAMBIAR CALIFICACION*****");
				System.out.println("Ingresa la posicion de la primera clificacion: ");
				IndiceUno = entrada.nextInt();
				System.out.println("Ingresa la posicion de la segunda clificacion: ");
				IndiceDos = entrada.nextInt();
				tda.intercambiar(IndiceUno, IndiceDos);
				tda.MostrarLista();
				
			}

		

		}
	}
}
