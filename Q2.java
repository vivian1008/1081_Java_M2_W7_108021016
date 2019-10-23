import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum = 0;
        for (int i = 3; i <= n; i += 3) {
            sum+=i;
        }
        System.out.println(sum);
    }
}