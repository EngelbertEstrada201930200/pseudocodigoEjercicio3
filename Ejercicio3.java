import java.util.*;
public class Ejercicio3 {

	public static void main (String[] args){

		int numero;
		Scanner entrada = new Scanner (System.in);

		System.out.print (" Ingrese un numero: ");
		numero = entrada.nextInt();

		 int factorial =  1;

		if ( numero >= 0 ) {

			for ( int i = 1  ; i < numero ; i=0 ){

				factorial = factorial*i;


			}

			System.out.println (" El factoral es : "+ factorial);


		} else {

			System.out.println (" No es una opcion valida");
		}
	}

}