package view;

import controller.PilhaVetor;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaVetor pv = new PilhaVetor();
		int [] vet = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3,-6, 2, -9, 1, -5};
		System.out.println(pv.vetpilha(vet));
		
		

	}

}
