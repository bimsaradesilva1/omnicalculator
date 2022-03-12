package serviceSubscriber;


import publisherSorting.SortingServicePublisher;
import publisherUnitConverter.UnitConverterPublisher;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import publisherFitnessCalc.FitnessCalcPublisher;
import publisherGeometryCalc.geometryCalcPublisher;


public class ServiceActivator implements BundleActivator {

	Scanner sc = new Scanner(System.in);
	int val = 0;
	
	ServiceReference serviceReference ;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Service Subscriber started");
		System.out.println();
		
		serviceReference = context.getServiceReference(geometryCalcPublisher.class.getName());
		geometryCalcPublisher calculatorpublish = (geometryCalcPublisher) context.getService(serviceReference);
		System.out.println(calculatorpublish.calculatorServiePublish());
		
		serviceReference = context.getServiceReference(UnitConverterPublisher.class.getName());
		UnitConverterPublisher unitConverterPublisher = (UnitConverterPublisher)context.getService(serviceReference);
		
		serviceReference = context.getServiceReference(SortingServicePublisher.class.getName());
		SortingServicePublisher sortingServicePublisher = (SortingServicePublisher)context.getService(serviceReference);
		
		serviceReference = context.getServiceReference(FitnessCalcPublisher.class.getName());
		FitnessCalcPublisher fitnessPublisher = (FitnessCalcPublisher)context.getService(serviceReference);
		
		while (true) {
			System.out.println();
			System.out.println("-----------------------------Welcome----------------------------");
			System.out.println("1.Calculator");
			System.out.println("2.Unit Convertor");
			System.out.println("3.Sorting");
			System.out.println("4.Fitness Tracker");
			System.out.println("99.Exit");
			System.out.println();
			System.out.print("Enter : ");
			
			val = sc.nextInt();
		
			if (val == 1 ) {
				while(true) {
					System.out.println();
					System.out.println("-----------------Calculator------------");
					System.out.println("Select the Calculator Mode:");
					System.out.println("1.Basic Calculator");
					System.out.println("2.Area Calculator");
					System.out.println("3.Percentage Calculator");
					System.out.println("99. Main Menu");
					System.out.println();
					System.out.print("Enter: ");
					
					int num = sc.nextInt();
					
					if(num == 1) {
						System.out.println();
						System.out.println("Select the option below");
						System.out.println("1.Addition");
						System.out.println("2.Substraction");
						System.out.println("3.Multipication");
						System.out.println("4.Divition");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						
						int num1 =  sc.nextInt();
						
						if(num1 == 1) {
							System.out.println();
							System.out.println("Enter the first Number :");
							double no1 = sc.nextDouble();
							
							System.out.println("Enter the second Number :");
							double no2 = sc.nextDouble();
							
							System.out.println("The answer is :"+calculatorpublish.add(no1, no2));
							
						}else if(num1 == 2) {
							System.out.println();
							System.out.println("Enter the first Number :");
							double no1 = sc.nextDouble();
							
							System.out.println("Enter the second Number :");
							double no2 = sc.nextDouble();
							
							System.out.println("The answer is :"+calculatorpublish.substract(no1, no2));
						}else if(num1 == 3) {
							System.out.println();
							System.out.println("Enter the first Number :");
							double no1 = sc.nextDouble();
							
							System.out.println("Enter the second Number :");
							double no2 = sc.nextDouble();
							
							System.out.println("The answer is :"+calculatorpublish.multiply(no1, no2));
						}else if(num1 == 4) {
							System.out.println();
							System.out.println("Enter the first Number :");
							double no1 = sc.nextDouble();
							
							System.out.println("Enter the second Number :");
							double no2 = sc.nextDouble();
							
							System.out.println("The answer is :"+calculatorpublish.divide(no1, no2));
						}else
							break;
						
						
					}else if(num == 2) {
						System.out.println();
						System.out.println("Select the shape below");
						System.out.println("1.Square");
						System.out.println("2.Rectangle");
						System.out.println("3.Trangle");
						System.out.println("4.Circle");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						
						num = sc.nextInt();
						
						if(num == 1) {
							System.out.println();
							System.out.println("Enter the size of one side :");
							double no1 = sc.nextDouble();
							
							System.out.println("The area is :"+calculatorpublish.squareArea(no1));
						}else if(num == 2) {
							System.out.println();
							System.out.println("Enter the Height :");
							double no1 = sc.nextDouble();
							
							System.out.println("Enter the Width :");
							double no2 = sc.nextDouble();
							
							System.out.println("The area is :"+calculatorpublish.rectangleArea(no1, no2));
						}else if(num == 3) {
							System.out.println();
							System.out.println("Enter the Height :");
							double no1 = sc.nextDouble();
							
							System.out.println("Enter the Base :");
							double no2 = sc.nextDouble();
							
							System.out.println("The area is :"+calculatorpublish.triangeArea(no1, no2));
						}else if(num == 4) {
							System.out.println();
							System.out.println("Enter the Radius :");
							double no1 = sc.nextDouble();
							
							System.out.println("The area is :"+calculatorpublish.circleArea(no1));
						}else 
							break;


						
					}else if(num == 3) {
						System.out.println();
						System.out.println("Select the option Below");
						System.out.println("1.Presentage Addition");
						System.out.println("2.Percentage Reduction");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						
						num = sc.nextInt();
						
						if(num == 1) {
							System.out.println();
							System.out.println("Enter the Amount :");
							double no1 = sc.nextDouble();
							System.out.println("Enter the percentage :");
							double no2 = sc.nextDouble();
							System.out.println("The Total amount is :" +calculatorpublish.percentageAdd(no1, no2));
						}else if(num == 2) {
							System.out.println();
							System.out.println("Enter the Amount :");
							double no1 = sc.nextDouble();
							System.out.println("Enter the percentage :");
							double no2 = sc.nextDouble();
							System.out.println("The Gross amount is :" +calculatorpublish.percentageReduce(no1, no2));
						}
					}else
						break;

				}
				
			} else if (val == 2) {
				while (true) {
					System.out.println("-------------------Unit Converter------------------");
					System.out.println("1. Length Conversion");
					System.out.println("2. Weight Conversion");
					System.out.println("3. Temperature Conversion");
					System.out.println("4. Digital Storage Conversion");
					System.out.println("99. Main Menu");
					System.out.println();
					System.out.print("Enter: ");
					int x = sc.nextInt();
					
					if(x == 1) {
						System.out.println();
						System.out.println("-------------------Length Conversion------------------");
						System.out.println("1. Meters to Centimeters");
						System.out.println("2. Centimeter to Meters");
						System.out.println("3. Meters to Feet");
						System.out.println("4. Feet to Meters");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						int n = sc.nextInt();
						
						if(n == 1) 
							unitConverterPublisher.metersToCentimeters();
						else if(n == 2) 
							unitConverterPublisher.centimetersToMeters();
						else if(n == 3)
							unitConverterPublisher.metersToFeet();
						else if(n == 4)
							unitConverterPublisher.feetToMeter();
						else if(n == 99)
							break;
						else
							continue;
					}
					else if(x == 2) {
						System.out.println();
						System.out.println("-------------------Weight Conversion------------------");
						System.out.println("1. Kilograms to Grams");
						System.out.println("2. Grams to Kilograms");
						System.out.println("3. Kilograms to Pounds");
						System.out.println("4. Pounds to Kilograms");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						int n = sc.nextInt();
						
						if(x == 1) 
							unitConverterPublisher.kilogramsToGrams();
						else if(x == 2)
							unitConverterPublisher.gramsToKilograms();
						else if(x == 3)
							unitConverterPublisher.kilogramsToPounds();
						else if(x == 4)
							unitConverterPublisher.poundsToKilograms();
						else if(x == 99)
							break;
						else
							continue;
					}
					else if(x == 3) {
						System.out.println();
						System.out.println("-------------------Temperature Conversion------------------");
						System.out.println("1. Celsius to Fahrenheit");
						System.out.println("2. Fahrenheit to Celsius");
						System.out.println("3. Celsius to Kelvin");
						System.out.println("4. Kelvin to Celsius");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						 int n = sc.nextInt();
						
						if(n == 1)
							unitConverterPublisher.celsiusToFahrenheit();
						else if(n == 2)
							unitConverterPublisher.fahrenheitToCelsius();
						else if(n == 3)
							unitConverterPublisher.celsiusToKelvin();
						else if(n == 4)
							unitConverterPublisher.kelvinToCelsius();
						else if(n == 99)
							break;
						else 
							continue;
					}
					else if(x == 4) {
						System.out.println();
						System.out.println("-------------------Digital Storage Conversion------------------");
						System.out.println("1. Bit to Byte");
						System.out.println("2. Byte to Bit");
						System.out.println("3. Byte to Kilobyte");
						System.out.println("4. Kilobyte to Byte");
						System.out.println("5. Byte to Megabyte");
						System.out.println("6. Megabyte to Byte");
						System.out.println("99. Back");
						System.out.println();
						System.out.print("Enter: ");
						int n = sc.nextInt();
						
						if(n == 1)
							unitConverterPublisher.bitToByte();
						else if(n == 2)
							unitConverterPublisher.byteToBit();
						else if(n == 3)
							unitConverterPublisher.byteToKilobyte();
						else if(n == 4)
							unitConverterPublisher.KilobyteToByte();
						else if(n == 5)
							unitConverterPublisher.byteToMegabyte();
						else if(n == 6)
							unitConverterPublisher.megabyteToByte();
						else if(n == 99)
							break;
						else
							continue;
					}
				}
				
			}else if (val == 3) {
				while (true) {
					System.out.println();
					System.out.println("----------- Sorting--------------");
			        System.out.println();
			        System.out.println("1. Ascending Order");
			        System.out.println("2. Descending Order");
			        System.out.println("99. Main Menu");
			        System.out.println();
			        System.out.print("Enter : ");
			        
			        int value = sc.nextInt();      
			        
			        if(value == 1) {
			        	sortingServicePublisher.ascendingOrde();
			        }else if(value == 2) {
			        	sortingServicePublisher.descendingOrder();
			        }else if( value == 99) {
			        	break;
			        }else {
			        	continue;
			        }
				}
			}else if( val == 4) {
				while(true) {
					System.out.println("-------------------Fitness Tracker------------------");
					System.out.println("1. Body Mass Index (BMI) Calculator");
					System.out.println("2. Body Metabolic Rate (BRI) Calculator");
					System.out.println("99. Main Menu");
					System.out.println();
					System.out.print("Enter: ");
					int x = sc.nextInt();
					
					if(x == 1) {
						fitnessPublisher.bodyMassIndexCalc(); 
					}
					else if(x == 2) {
						fitnessPublisher.basalMetabolicRateCalc(); 
					}
					else if(x == 99)
						break;
					else 
						continue;
				}
				
			}else if(val == 99) {
				System.out.println("--------------Thank you---------------");
				break;
			}else {
				continue;
			}
		}
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Service Subscriber stopped");
		System.out.println();
		context.ungetService(serviceReference);
	}

}
