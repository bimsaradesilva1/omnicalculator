package publisherSorting;

import java.util.Scanner;

public class SortingServicePublisherImpl implements SortingServicePublisher {

	Scanner sc = new Scanner(System.in);

	@Override
	public void ascendingOrde() {
		
		System.out.println();
		System.out.print("How many numbers  : ");
		int number = sc.nextInt();
		
		int array[] = new int[number];
		
		System.out.println();
		System.out.print("Please enter the "+ number + " numbers : ");
		
		for(int i=0; i<number ; i++) {
			array[i] = sc.nextInt();
		}
		
		for( int i = 0; i < number-1 ; i++) {
			for(int j = 0; j < number-i -1; j++) {
				if(array[j] > array[j+1]){
					
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Ascending Order: ");
		
		for(int i=0; i < number ; i++) {
			
			System.out.print(array[i] + " ");
		}
		System.out.println();		
	}

	
	@Override
	public void descendingOrder() {
		
		System.out.println();
		System.out.print("How many numbers you want to sort : ");
		int number = sc.nextInt();
			
		int array[] = new int[number];
		
		System.out.println();
		System.out.print("Please enter the "+ number + " numbers : ");
		
		for(int i=0; i<number ; i++) {
			array[i] = sc.nextInt();
		}
			
			for( int i = 0; i < number-1 ; i++) {
				for(int j = 0; j < number-i -1; j++) {
					if(array[j] < array[j+1]){
						
						int temp = array[j];
						array[j]= array[j+1];
						array[j+1] = temp;
					}
				}
			}
			System.out.println();
			System.out.print("Descending Order: ");
			
			for(int i=0; i < number ; i++) {
				
				System.out.print(array[i] + " ");
			}
			System.out.println();		
	}

}
