import java.util.*;
public class CodeChef52 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            String S=input.next();
            String M=input.next();
            for (int j = 0; j < 5; j++) {
                if(S.charAt(j)==M.charAt(j)){
                    System.out.print("G");
                }
                else{
                    System.out.print("B");
                }
                
            }
            
        }

    }
    
}
