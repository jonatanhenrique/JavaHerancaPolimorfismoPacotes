package br.com.Bytebank.Banco.testes;

public class TesteArray {

	public static void main(String[] args) {
		
		int [] idades = new int[5];

		for(int i =0; i < idades.length; i++) {
			idades[i] = i*i;
		}
		
		for(int i =0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
