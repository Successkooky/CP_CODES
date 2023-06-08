import java.util.*;
public class CodeChef55 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            int N=input.nextInt();
            int X=input.nextInt();
            int a=N/3;
            int b=N-a;
            System.out.println(b*X);
            
        }
    }
    
}
