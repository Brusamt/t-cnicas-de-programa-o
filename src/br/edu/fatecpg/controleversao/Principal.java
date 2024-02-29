package br.edu.fatecpg.controleversao;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int operacao;
		double num1, num2;
    Scanner scan = new Scanner(System.in);
    
    while(true) {
    	System.out.println("Digite a operação desejada: ");
    	operacao = scan.nextInt();
    	System.out.println("Digite seu primeiro valor: ");
    	num1 = scan.nextDouble();
    	System.out.println("Digite seu segundo valor: ");
    	num2 = scan.nextDouble();
    	
    	switch(operacao) {
    	case 1: 
    		resultado = calc.soma(num1, num2);
    		break;
    	case 2: 
    		resultado = calc.subtrai(num1, num2);
    		break;
    	case 3: 
    		resultado = calc.multiplica(num1, num2);
    		break;
    	case 4: 
    		resultado = calc.dividi(num1, num2);
    		break;
    	   	
    	}
    }
	}
}
