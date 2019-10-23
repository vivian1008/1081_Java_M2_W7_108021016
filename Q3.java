import java.util.*;
public class Q3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        float n = scn.nextFloat();
        float maxval = n;
        float minval = n;
        for(int i = 1; i < 10; i++){
            n=scn.nextFloat();
            if(n>maxval){
                maxval=n;
            }
            else if(n<minval){
                minval=n;
            }
        }
        System.out.printf("Max="+"%.2f\n",maxval);
        System.out.printf("Min="+"%.2f\n",minval);
    }
}