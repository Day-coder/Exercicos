package com.letscode.exercicio;

public class BrinquedoImpl implements Brinquedo {

	@Override
	public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
		
		System.out.print("Você pode ir no(s) seguinte(s) brinquedos: Roda Gigante ");
		if(idade>6 && altura > 1.30) {
			
			if(idade> 16 && altura> 1.50) {
				System.out.print(", Carrossel e Montanha Russa");
				return true;
			}
			else {
				System.out.print("e Carrossel");
			}
			return true;
		}
		else
		return false;
	}

}
