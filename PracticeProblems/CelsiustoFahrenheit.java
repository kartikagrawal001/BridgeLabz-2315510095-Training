package PracticeProblems;
import java.util.*;
public class CelsiustoFahrenheit{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp in Celsius");
		int Celsius = sc.nextInt();
		int Fahrenheit = (Celsius * 9/5) + 32;
		System.out.print(Fahrenheit);
		}
	}

