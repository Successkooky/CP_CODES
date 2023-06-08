import java.util.*;
public class CodeChef53 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            String S=input.next();
            
                if(S.substring(0, N/2).equals(S.substring(N/2, N))){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            
            
        }
    }
    
}
