package calculadorasimples;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		float num1;
		float num2;
		String operador;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		num1 = ler.nextFloat();
		System.out.print("Digite um numero: ");
		num2 = ler.nextFloat();
		
		System.out.print("digite o operador: ");
		operador = ler.next();
		
		switch(operador) {
			case "+":
				System.out.println("resultado:"+(num1+num2));
				break;
			case "-":
				System.out.println("resultado:"+(num1-num2));
				break;
			case "*":
				System.out.println("resultado:"+(num1*num2));
				break;
			case "/":
				if(num2!=0)
					System.out.println("resultado:"+(num1/num2));
				else
					System.out.println("nao e possivel divisao por 0");
				break;
	        default:
	        	System.out.println("operador invalido!");
	        	break;
		}
	}

}
