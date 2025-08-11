package PracticeProblems;

import java.util.Scanner;

public class PowerCalculation {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		int Base= sc.nextInt();
		System.out.println("Enter Exponent");
		int Exponent = sc.nextInt();
		Double Ans = Math.pow(Base,Exponent);
		System.out.print(Ans);
		}
}
