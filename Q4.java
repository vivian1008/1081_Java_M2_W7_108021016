import java.util.*;
public class Q4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        boolean flag = true; 
        for(int i =2; i <= n/2; i++){
            if(n%i==0){
                flag=false;
                break;      
            }
        }
            if(flag){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }
}