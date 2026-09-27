/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

public class Conteo{
	double[] calificaciones;

	public Conteo(double[] calificaciones){
		this.calificaciones = calificaciones;
	}

	public int aprobadas(){
		int aprobadas=0;
		
		for (int i=0; i<calificaciones.length; i++){
			if(calificaciones[i]>=6){
				aprobadas++;
			}
		}
		
		return aprobadas;
	}

	public int reprobadas(){
		int reprobadas=0;

		for(int i=0; i<calificaciones.length; i++){
			if(calificaciones[i]<6){
				reprobadas++;
			}
		}

		return reprobadas;	
	}

	public double porcentrajeApr(){
		return (aprobadas() * 100.0)/calificaciones.length;
	}

	public double porcentajeRep(){
		return (reprobadas() * 100.0)/calificaciones.length;
	}

}