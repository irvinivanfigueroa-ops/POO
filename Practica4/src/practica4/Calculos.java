/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

import java.util.Arrays;

public class Calculos{
	
	double[] calificaciones;

	public Calculos(double[] calificaciones){
		this.calificaciones=calificaciones;
		Arrays.sort(this.calificaciones);
	}

	public double promedio(){
		double suma=0;
		for(int i=0; i<calificaciones.length; i++){
			suma += calificaciones[i]; 	
		}
		
		return suma/(calificaciones.length);
	}

	
	public double maximo(){
		return calificaciones[calificaciones.length - 1];
	}

	public double minimo(){
		return calificaciones[0];
	}

}