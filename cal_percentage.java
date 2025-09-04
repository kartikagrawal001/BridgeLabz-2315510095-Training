import java.util.*;
public class cal_percentage {
    public static double avg(int P, int C,int M){
        double average = (P+C+M)/3;
        return average;
    }
    public static double per(int P, int C,int M){
        double percentage = ((P+C+M)/300.0 )*100;
        return percentage;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int P = sc.nextInt();
        int C = sc.nextInt();
        int M= sc.nextInt();
        System.out.println(avg(P,C,M));
        System.out.println(per(P,C,M));
    }
    }
    

