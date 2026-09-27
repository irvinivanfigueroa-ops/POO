/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

public class Inventario{

	String[] nombres;
	double[] precios;
	int[] existencias;

	public Inventario(String[] nombres, double[] precios, int[] existencias){
		this.nombres = nombres;
		this.precios = precios;
		this.existencias = existencias;
	}

	public void mostrarTodo(){
		for(int i=0; i<nombres.length; i++){
			System.out.println(nombres[i] + " | Precio: " + precios[i] + " | Existencia: " + existencias[i]);
		}
	}

	public int buscar(String nombre){
		for(int i=0; i<nombres.length; i++){
			if(nombres[i].equalsIgnoreCase(nombre)){
				System.out.println("Encontrado -> " + nombres[i] + " | Precio: " + precios[i] + " | Existencia: " + existencias[i]);
				return i;
			}
		}
		System.out.println("Producto no encontrado: " + nombre);
		return -1;
	}

	public void actualizarExistencia(String nombre, int nuevaExistencia){
		int i = buscar(nombre);
		if(i != -1){
			existencias[i] = nuevaExistencia;
			System.out.println("Existencia actualizada para " + nombre + ": " + nuevaExistencia);
		}
	}

	public double valorTotal(){
		double total = 0;
		for(int i=0; i<nombres.length; i++){
			total += precios[i] * existencias[i];
		}
		return total;
	}

}