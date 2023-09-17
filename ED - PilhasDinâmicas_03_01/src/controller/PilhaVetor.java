package controller;

import model.PlhaInt;

public class PilhaVetor {

	public PilhaVetor() {
		super();
	}
	
	public int vetpilha(int[]vetor) throws Exception {
		PlhaInt p = new PlhaInt();
		int a;
		int b;
		int res;
		for(int i = 0; i < 16 ; i++) {
			if(vetor[i]>=0) {
				p.push(vetor[i]);
			}else {
				a = p.pop();
				b = p.pop();
				res = a + b;
				p.push(vetor[i]);
				p.push(res);
			}
		}
		int tamanho = p.size();
		return tamanho;
	}

}
