package PracticeProblems;

import java.util.Scanner;

public class KilometeresToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in km");
        int Kilometeres = sc.nextInt();

        double Miles = Kilometeres * 0.621371;
        System.out.println(Miles);
    }
}
