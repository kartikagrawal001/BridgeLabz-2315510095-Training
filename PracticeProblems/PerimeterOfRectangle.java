package PracticeProblems;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int Length = sc.nextInt();
		System.out.println("Enter Width");
		int Width = sc.nextInt();
		int perimeter = 2*(Length+Width);
		System.out.print(perimeter);
		}
}
