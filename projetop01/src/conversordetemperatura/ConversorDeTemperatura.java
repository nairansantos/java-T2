package conversordetemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
	public static void main(String[] args) {
		double temperatura;
		String unidadeorigem;
		double temperaturaconvertida ;
		Scanner ler = new Scanner(System.in);

		System.out.print("Insira a temperatura: ");
		temperatura = ler.nextDouble();

		System.out.println("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
		unidadeorigem = ler.next();

		if (unidadeorigem .equalsIgnoreCase("C")) {
			temperaturaconvertida = celsiusParaFahrenheit(temperatura);
			System.out.println("A temperatura convertida é: " + temperaturaconvertida);
			temperaturaconvertida = ler.nextDouble();
		} else if(unidadeorigem.equalsIgnoreCase("F")) {
			temperaturaconvertida = fahrenheitParaCelsius(temperatura);
			System.out.println("A temperatura convertida é: " + temperaturaconvertida);
			temperaturaconvertida = ler.nextDouble();
		} else {

			System.out.println("Opção inválida. Por favor, escolha C ou F.");
		}

	}

	private static double celsiusParaFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	static private double fahrenheitParaCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
