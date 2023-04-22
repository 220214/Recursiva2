package view;

import controller.Menor;

public class Main1 {

	public static void main(String[] args) {
		int [] vt = { 3,9,1,5,19};
		int tam = vt.length;
		int Ultmenor=vt[tam -1];
		
		Menor m = new Menor();
		int menor = m.menorvalor(vt, tam,Ultmenor );
		System.out.println("Menor valor do vetor é " + menor);
		
	}

}