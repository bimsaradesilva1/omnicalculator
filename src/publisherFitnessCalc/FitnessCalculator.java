package publisherFitnessCalc;

import java.util.Scanner;

public class FitnessCalculator implements FitnessCalcPublisher {

	double weightInput = 0, heightInput = 0, ageInput = 0, answer = 0;
	int genderInput, activityInput; 
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void BMICalc() {
		System.out.println("-------------------------Body Mass Index Calculator-----------------------");
		
		System.out.print("Weight: ");
		weightInput = sc.nextDouble();
		
		System.out.print("Height: ");
		heightInput = sc.nextDouble();
		
		answer = (weightInput / (heightInput * heightInput))*10000; 
		System.out.println("The Body Mass Index (BMI): " + answer);
		
		if (answer < 18.5) {
			System.out.println("You are underweight."); 
		} else if (answer >= 18.5 && answer <= 24.9) {
			System.out.println("You are normal."); 
		} else if (answer >= 25 && answer <= 29.9) {
			System.out.println("You are overweight."); 
		} else if (answer >= 30) {
			System.out.println("You are obese."); 
		} 
	}

	@Override
	public void BMRCalc() {
		System.out.println("-------------------------Basal Metabolic Rate Calculator-----------------------");
		
		System.out.print("Weight: ");
		weightInput = sc.nextDouble();
		
		System.out.print("Height: ");
		heightInput = sc.nextDouble();
		
		System.out.print("Age: ");
		ageInput = sc.nextDouble();
		
		do {
			System.out.println("Activity:"); 
			System.out.println("\t1. Light");
			System.out.println("\t2. Moderate"); 
			System.out.println("\t3. Vigorous"); 
			System.out.print("Enter: "); 
			activityInput = sc.nextInt(); 
		} while (activityInput < 1 || activityInput > 3);
		
		do {
			System.out.println("Gender:"); 
			System.out.println("\t1. Male");
			System.out.println("\t2. Female"); 
			System.out.print("Enter: "); 
			genderInput = sc.nextInt(); 
		} while (genderInput < 1 || genderInput > 2);
		
		if (genderInput == 1) {
			answer = (10*weightInput) + (6.25*heightInput) - (5*ageInput) + 5; 
		} else {
			answer = (10*weightInput) + (6.25*heightInput) - (5*ageInput) - 161; 
		}
		
		if (activityInput == 1) {
			answer = answer * 1.53; 
		} else if (activityInput == 2) {
			answer = answer * 1.76;
		} else {
			answer = answer * 2.25; 
		}
	
		System.out.println("\nYou need an intake of " + answer + " calories everyday to maintain your current weight.");
	
	}



	@Override
	public void runningCalories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walkingCalories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swimmingCalories() {
		// TODO Auto-generated method stub
		
	}
}
