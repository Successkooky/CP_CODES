import java.util.*;
public class CodeChef61 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            
            for (int i = 0; i < n; i++) {
                if (i== 0 ||  i == n - 1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println(" ");
        }



    }
    
}
