package publisherUnitConverter;

import java.util.Scanner;

public class UnitConverterPublisherImpl implements UnitConverterPublisher {

	double input = 0, answer = 0;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void metersToCentimeters() {
		System.out.println("-------------------------Meters to Centimeters Conversion-----------------------");
		System.out.print("Meters: ");
		input = sc.nextDouble();
		
		answer = (input * 100.0);
		System.out.println("Centimeters: " + answer + "cm \n");
	}

	@Override
	public void centimetersToMeters() {
		System.out.println("-------------------------Centimeters to Meters Conversion-----------------------");
		System.out.print("Centimeters: ");
		input = sc.nextDouble();
		
		answer = (input/100.0);
		System.out.println("Meters: " + answer + "m \n");
	}


	public void kilogramsToGrams() {
		System.out.println("-------------------------Kilograms to Grams Conversion-----------------------");
		System.out.print("Kilograms: ");
		input = sc.nextDouble();
		
		answer = (input * 1000.0);
		System.out.println("Grams: " + answer + "g \n");
	}

	@Override
	public void gramsToKilograms() {
		System.out.println("-------------------------Grams to Kilograms Conversion-----------------------");
		System.out.print("Grams: ");
		input = sc.nextDouble();
		
		answer = (input/1000.0);
		System.out.println("Kilograms: " + answer + "kg \n");
	}


	@Override
	public void celsiusToFahrenheit() {
		System.out.println("-------------------------Celsius to Fahrenhiet Conversion-----------------------");
		System.out.print("Celsius: ");
		input = sc.nextDouble();
		
		answer = (input * 9/5) + 32;
		System.out.println("Fahrenheit: " + answer + "°F \n");
	}

	@Override
	public void fahrenheitToCelsius() {
		System.out.println("-------------------------Fahrenheit to Celsius Conversion-----------------------");
		System.out.print("Fahrenheit: ");
		input = sc.nextDouble();
		
		answer = (input - 32) * 5/9;
		System.out.println("Celsius: " + answer + "°C \n");
	}

}
