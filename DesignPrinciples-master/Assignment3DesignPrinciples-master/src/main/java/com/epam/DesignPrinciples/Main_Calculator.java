package com.epam.DesignPrinciples;
import java.util.*;

public class Main_Calculator {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("       Calculator ");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice");
		int choice = s.nextInt();
		if(choice>=1 && choice<=4) {
			System.out.println("Enter two numbers");
			Scanner sc = new Scanner(System.in);
			double first = s.nextDouble();
			double second = s.nextDouble();
			double result;
			Math obj = new Math(first,second);
			switch(choice) {
				case 1: obj.Add();
						break;
					
				case 2:obj.Sub();
						break;
			
				
				case 3:obj.Multiply();
						break;
	
					
				case 4:obj.Div();
						break;
	
			} 
		}else {
			System.out.println("your option is invalid");
		}
			
	}

}
