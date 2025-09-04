import java.util.*;
public class viwa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,0,2,4,5,0,3,5,9,0,0,1};  
        int  j = 0; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

}   

