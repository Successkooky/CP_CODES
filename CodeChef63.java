import java.util.*;
public class CodeChef63 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while (t-->0) {
            int N=input.nextInt();
            int K=input.nextInt();
            int L=input.nextInt();
            int ct=0;
            for (int i = 0; i < N; i++) {
                
            
            int Mi=input.nextInt();
            
            int Li=input.nextInt();
             if(K==1 && Li==L){
                System.out.println();
            }
            else if(K>1 && Li==L){
                ct+=Mi;
                System.out.println(ct);
            }
            else{
                System.out.println(-1);
            }
            

            }
           
            
            
        }
    }
    
}
