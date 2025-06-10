import java.util.*;
import java.lang.Math;
public class task33{
    public static boolean isfib(int n){
        int num1=(5*(n*n))+4;
        int num2=(5*(n*n))-4;
        return (is_per_sqr(num1)||is_per_sqr(num2));
    }
    public static boolean is_per_sqr(int num){
        int prod=(int)Math.sqrt(num);
        return prod*prod==num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int in_num=sc.nextInt();
        boolean b=isfib(in_num);
        System.out.print(b);
    }
}