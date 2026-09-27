/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

public class ComparadorNumeros{

	double[] numeros;

	public ComparadorNumeros(double[] numeros){
		this.numeros = numeros;
	}

	public double mayor(){
		double mayor = numeros[0];
		for(int i=1; i<numeros.length; i++){
			if(numeros[i] > mayor) mayor = numeros[i];
		}
		return mayor;
	}

	public double menor(){
		double menor = numeros[0];
		for(int i=1; i<numeros.length; i++){
			if(numeros[i] < menor) menor = numeros[i];
		}
		return menor;
	}

}