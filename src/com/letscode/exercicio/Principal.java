package com.letscode.exercicio;

import java.util.function.BiPredicate;

public class Principal {

	public static void main(String[] args) {
		
		BrinquedoImpl brinquedo1= new BrinquedoImpl();
		brinquedo1.avaliarRequisitosBrinquedo(5, 1.50);
		 System.out.println("");
		
		
verificarBrinquedo(new Brinquedo() {	
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
		});

System.out.println("");

		
verificarBrinquedo(((idade, altura)->{
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
	
}));

System.out.println("");

verificarBrinquedoPredicate(((idade, altura)->{
	System.out.print("Você pode ir no(s) seguinte(s) brinquedos: Roda Gigante ");
	if((int)idade>6 && (double)altura > 1.30) {
		if((int)idade> 16 && (double) altura> 1.50) {
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
	
}));

}

	private static void verificarBrinquedo(Brinquedo brinquedo) {
		brinquedo.avaliarRequisitosBrinquedo(10, 1.35);
		
	}
	

	private static void verificarBrinquedoPredicate(BiPredicate brinquedo) {
		brinquedo.test(17, 1.70);
		
	}
	
}
