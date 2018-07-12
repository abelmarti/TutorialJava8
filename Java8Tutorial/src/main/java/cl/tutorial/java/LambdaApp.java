package cl.tutorial.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cl.tutorial.interfaces.Operacion;

public class LambdaApp {

	public void ordenar() {
		List<String> lista = new ArrayList<String>();
		lista.add("trabajo");
		lista.add("axity");
		lista.add("vass");

		// java 1.7 para atrás
		/*
		 * Collections.sort(lista, new Comparator<String>() {
		 * 
		 * public int compare(String o1, String o2) { // TODO Auto-generated
		 * method stub return o1.compareTo(o2); }
		 * 
		 * });
		 */

		// java 1.8

		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		for (String string : lista) {
			System.out.println(string);
		}

	}

	public void calcular() {
		
		// java 1.7 para atrás
		Operacion operacion = new Operacion() {

			@Override
			public double calcularPremedio(int n1, int n2) {
				// TODO Auto-generated method stub
				return (n1 + n2) / 2;
			}
		};
		
		//java 1.8
		
		Operacion operacion2=(int x , int y)->(x+y)/2;
		
		
		System.out.println("calcular promedio ->" + operacion2.calcularPremedio(4, 2));
	}

	public static void main(String[] args) {
		LambdaApp app=new LambdaApp();
		//app.ordenar();
		app.calcular();
	}

}
