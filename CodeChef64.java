import java.util.*;
public class CodeChef64 {
    public static void main(String args[]){
        	Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int N=input.nextInt();
		    int K=input.nextInt();
		    int Con1=(int)Math.pow(K,N);
            
            // if(N<K){
            //     System.out.println(Con1);
            // }
            
            
            if(N>=K){
                int f=1;
                int j=1;
                while(j<=K){
                    f=f*j;
                    j++;
                    
                    
                    
                }
                
                System.out.println(f);
                
            }
            else{
                System.out.println(Con1);
            }

            
            
    }
    
}
}
