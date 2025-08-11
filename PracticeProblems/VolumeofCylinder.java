package PracticeProblems;
import java.util.*;
public class VolumeofCylinder{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius = sc.nextInt();
		
		System.out.println("Enter Height");
		int Height = sc.nextInt();
		
		double rq = Math.pow(radius,2);
		double Volume  = (22.0/7) * rq * Height;
		System.out.print(Volume);
		sc.close();
		}
	}

