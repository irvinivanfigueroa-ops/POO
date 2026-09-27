/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

public class Practica4{
	public static void main(String[] args){

		if(args.length==0){
			System.out.println("No se recibieron argumentos, por lo que no se puede ejecutar el codigo");
			System.out.println("Para poder utilizar este codigo se deben pasar argumentos al ejecutar el codigo, esto de la siguiente manera");
			System.out.println("java Practica4 arg1 arg2 arg3...    Presionar Enter");
			System.out.println("Se esperan: 10 numeros, luego 20 calificaciones, luego tripletas nombre-precio-existencia del inventario");
			return;
		}

		System.out.println("=========== EJERCICIO 1: MAYOR Y MENOR DE 10 NUMEROS ===========");
		double[] numeros = new double[10];
		for(int i=0; i<10; i++){
			try{
				numeros[i] = Double.parseDouble(args[i]);
			}
			catch(NumberFormatException e){
				System.out.println("Error, el argumento " + args[i] + " no es un dato valido");
			}
		}

		ComparadorNumeros comparador = new ComparadorNumeros(numeros);
		System.out.println("Numeros ingresados: " + numeros.length);
		System.out.println("Mayor: " + comparador.mayor());
		System.out.println("Menor: " + comparador.menor());


		System.out.println("\n=========== EJERCICIO 2: 20 CALIFICACIONES ===========");
		double[] calificaciones = new double[20];
		for(int i=0; i<20; i++){
			try{
				calificaciones[i] = Double.parseDouble(args[10+i]);
			}
			catch(NumberFormatException e){
				System.out.println("Error, el argumento " + args[10+i] + " no es un dato valido");
			}

			if(calificaciones[i]<0 || calificaciones[i]>10){
				System.out.println("El dato " + calificaciones[i] + " esta fuera del rango permitido (0-10)");
			}
		}

		Calculos calculos = new Calculos(calificaciones);
		Conteo conteo = new Conteo(calificaciones);

		System.out.println("Calificaciones: " + calificaciones.length);
		System.out.println("Promedio: " + calculos.promedio());
		System.out.println("Máximo: " + calculos.maximo());
		System.out.println("Mínimo: " + calculos.minimo());
		System.out.println("Aprobados: " + conteo.aprobadas() + " (" + conteo.porcentrajeApr() + "%)");


		System.out.println("\n=========== EJERCICIO 3: INVENTARIO ===========");
		int restantes = args.length - 30;
		int n = restantes / 3;

		String[] nombres = new String[n];
		double[] precios = new double[n];
		int[] existencias = new int[n];

		int indice = 0;
		for(int i=30; i<args.length; i+=3){
			nombres[indice] = args[i];
			try{
				precios[indice] = Double.parseDouble(args[i+1]);
				existencias[indice] = Integer.parseInt(args[i+2]);
			}
			catch(NumberFormatException e){
				System.out.println("Error, datos invalidos para el producto " + nombres[indice]);
			}
			indice++;
		}

		Inventario inventario = new Inventario(nombres, precios, existencias);
		inventario.mostrarTodo();
		System.out.println("Valor total del inventario: " + inventario.valorTotal());

		inventario.buscar(nombres[0]);
		inventario.actualizarExistencia(nombres[0], existencias[0] + 10);
		inventario.buscar(nombres[0]);

	}
}