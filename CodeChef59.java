import java.util.Scanner;
public class CodeChef59 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       int t=input.nextInt();
        for (int i = 0; i <t; i++) {
             int N = input.nextInt();
		    int K = input.nextInt();
		    if(N % K == 0)
		    System.out.println(N / K);
		    else
		    System.out.println(-1);
        
       }
        
    }
    
}
