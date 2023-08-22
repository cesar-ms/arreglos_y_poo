package arreglos;

/**
 * @author Julio Cesar Morales sierra
 * 
 **/

public class TDAArreglo {

	private float[] arreglo;

	/***
	 * Constructor
	 * 
	 * @param arreglo
	 */
	public TDAArreglo(float[] arreglo) {
		this.arreglo = arreglo;
	}

	/***
	 * Metodo que busca una calificacion en el arreglo
	 * 
	 * @param valor
	 * @return
	 */
	public int buscar(float valor) {
		int i;
		float cal = valor;
		for (i = 0; i < this.arreglo.length; i++) {
			if (valor == this.arreglo[i]) {
				cal = valor;
				break;
			}
		}
		if (i == this.arreglo.length) {
			i = -1;
		}
		return i;
	}

	/**
	 * Metodo que simula la eliminacion de una calificacion, dado que no se elimina
	 * solo se remplaza por el valor de cero.
	 * 
	 * Se busca mediante el indice de la calificacion.
	 * 
	 * @param indice
	 */
	public void borrar(int indice) {
		indice--;
		if (indice >= 0 && indice <= arreglo.length) {
			for (int i = 0; i < arreglo.length; i++) {
				if (i == indice) {
					arreglo[i] = 0;
					System.out.println("La calificacion se elimino");
					break;
				}
			}
		} else {
			System.out.println("No se encontro calificacion");
		}
	}

	/**
	 * 
	 * Metodo que intercambia dos calificaciones en diferente posicion
	 * 
	 * @param indiceUno
	 * @param indiceDos
	 * @return
	 */

	public float intercambiar(int indiceUno, int indiceDos) {
		float temp = this.arreglo[indiceUno - 1];
		this.arreglo[indiceUno - 1] = this.arreglo[indiceDos - 1];
		this.arreglo[indiceDos - 1] = temp;
		return temp;
	}

	/***
	 * Muesta la lista de calificaciones
	 * 
	 */

	public void MostrarLista() {
		if (this.arreglo.length > 0) {
			for (int i = 0; i < this.arreglo.length; i++) {
				System.out.println("[" + (i + 1) + "]-" + "calif:" + this.arreglo[i]);
			}

		} else {
			System.out.println("No existen elementos");
		}
	}

	/***
	 * 
	 * Metodo que calcula el promedio
	 * 
	 */

	public void promedio() {
		float suma = 0.0f;
		for (int i = 0; i < arreglo.length; i++) {
			suma += this.arreglo[i];
		}
		float promedio = suma / arreglo.length;
		System.out.println("El promedio es:" + promedio);

	}

	/**
	 *
	 * Metodo que obtine la calificacion con mayor puntaje
	 * 
	 */

	public void calificacionMayor() {
		float temporal = 0;
		for (int i = 0; i < arreglo.length; i++) {
			if (temporal < this.arreglo[i]) {
				temporal = this.arreglo[i];
			}

		}
		System.out.println("La calificaion mayor es:" + temporal);
	}

	/**
	 *
	 * Metodo que obtine la calificacion con menor puntaje
	 * 
	 */

	public void calificacionMenor() {
		float temporal = 10;
		for (int i = 0; i < arreglo.length; i++) {
			if (temporal > this.arreglo[i]) {
				temporal = this.arreglo[i];
			}
		}
		System.out.println("La calificacion menor es:" + temporal);
	}

	/**
	 * El metodo calcula el rango de calificaciones
	 * 
	 */

	public void Rango() {
		float temp = 0;
		float temp2 = 10;
		float resultado = 0;
		for (int i = 0; i < arreglo.length; i++) {
			if (temp < this.arreglo[i]) {
				temp = this.arreglo[i];
			}
			if (temp2 > this.arreglo[i]) {
				temp2 = this.arreglo[i];
			}
			resultado = temp - temp2;
		}
		System.out.println("El rango es: " + resultado);
	}

	/**
	 * El metodo obtiene la calificacion que mas se repite, es decir la moda que hay
	 * en el conjunto de calificaciones, dado caso de que no encuentre una moda esta
	 * mostrara la ultima calificacion.
	 */
	public void Moda() {
		float maxVecesRepetido = 0;
		int moda = 0;
		for (int i = 0; i < arreglo.length; i++) {
			float vecesRepetido = 0;
			for (int j = 0; j < arreglo.length; j++) {
				if (this.arreglo[i] == this.arreglo[j]) {
					vecesRepetido++;
				}
				if (vecesRepetido >= maxVecesRepetido) {
					moda = (int) this.arreglo[i];
					maxVecesRepetido = vecesRepetido;
				}
			}

		}
		System.out.println("La moda es " + moda + " y se repite " + maxVecesRepetido + " veces");
	}

}
