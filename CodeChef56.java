import java.util.*;
public class CodeChef56 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int n=input.nextInt();
            
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=input.nextInt();
             }

            int count=n;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]==arr[j+1]){
                    count--;
                }

                
            }
            System.out.println(count);
            
            
        }
    }
    
}
