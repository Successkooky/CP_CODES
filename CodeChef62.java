import java.util.*;
public class CodeChef62 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while (t-->0) {
            int B1=input.nextInt();
            int B2=input.nextInt();
            int B3=input.nextInt();
            if((B1+B2+B3)<=1){
                System.out.println("Water filling time");
            }
            else{
                System.out.println("Not now");
            }
            
        }
    }
    
}
