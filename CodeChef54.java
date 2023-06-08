import java.util.*;
public class CodeChef54 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int X=input.nextInt();
            int Y=input.nextInt();
            int Z=(X+Y)/2;
            System.out.println(Math.max(Math.abs(X-Z),Math.abs(Y-Z)));
            
        }
    }
    
}
