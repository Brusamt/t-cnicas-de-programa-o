package br.edu.fatecpg.controleversao;

public class Principal {
	
	public static void main(String[] args) {
	System.out.println("Olá Mundo");
	
	Somar calc = new Somar();
	System.out.println(calc.soma(20, 10));
	}
}
