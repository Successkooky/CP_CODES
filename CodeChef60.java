import java.util.*;
public class CodeChef60 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int c=0;
            int n=input.nextInt();
            String s=input.next();
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)!='a'&& s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o' && s.charAt(i)!='u'){
                    c++;
                }
                else{
                    c=0;
                }
                if(c>=4){
                    System.out.println("NO");
                    break;
                }
                
            }
            if(c!=4){
                System.out.println("YES");
            }
        }
    }
    
}
