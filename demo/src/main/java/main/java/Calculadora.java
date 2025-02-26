package main.java;
import java.util.*;
public class Calculadora {

	public static void main(String[] args) {
		int num1;
		int num2;
		int operacion;
		boolean salir = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduce un segundo número:");
		num2 = sc.nextInt();
		System.out.println("¿Que operación desea realizar?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		operacion = sc.nextInt();

		do {
			switch(operacion) {

			case 1: 
				System.out.println("La suma entre " + num1 + " y " + num2 + " es: " + calculadora(num1, num2, operacion));
				salir = false;
				break;
			case 2: 
				System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + calculadora(num1, num2, operacion));
				salir = false;
				break;
			case 3: 
				System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es: " + calculadora(num1, num2, operacion));
				salir = false;
				break;
			case 4: 
				System.out.println("La división entre " + num1 + " y " + num2 + " es: " + calculadora(num1, num2, operacion));
				salir = false;
				break;
			default:
				System.out.println("Elige una opción correcta.");
				break;
			}
			
		}while(salir);


	}

	public static int calculadora(int num1, int num2, int operacion) {
		int resultado = 0;
		switch (operacion) {
		case 1:
			resultado = sumar(num1, num2);
			break;
		case 2:
			resultado =  restar(num1, num2);
			break;
		case 3:
			resultado = multiplicar(num1, num2);
			break;
		case 4:
			resultado = division(num1, num2);
			break;
		default:
			System.out.println("Introduzca una opción correcta");
			break;
		}
		return resultado;
	}

	public static int sumar(int num1, int num2) {

		int resultado = num1 + num2;
		return resultado;
	}

	public static int restar(int num1, int num2) {

		int resultado = num1 - num2;
		return resultado;
	}

	public static int multiplicar(int num1, int num2) {

		int resultado = num1 * num2;
		return resultado;
	}

	public static int division(int num1, int num2){
		int resultado;
		if(num2 == 0)
			throw new ArithmeticException("No se puede dividir entre cero");
		else
			resultado = num1/num2;
		return resultado;

	}

	public static int potencia(int num1, int num2) {
		int resultado = 1;
		for(int i = 0; i < num2; i++) {
			resultado = (int) Math.pow(num1, num2);
		}
		return resultado;
	}

	public static int media(int num1, int num2) {
		int resultado = (num1 + num2) / 2;
		return resultado;
	}

	public static int multiplicacion_de_3(int num1, int num2, int num3) {
		int resultado = num1 * num2 * num3;
		return resultado;
	}
}
