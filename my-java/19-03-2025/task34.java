import java.util.*;
import java.lang.Math;
public class task34{
    public static int print_fib(int n){
        int a=0;
        int b=1;
        int c=0;
        int req=0;
        System.out.print(b);
        for(int i=2;i<=n;i++){
            c=a+b;
            if(i==n){
                req=c;
            }
            a=b;
            b=c;
            System.out.print(" "+c);
        }
        System.out.println();
        return req;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("The Fibonacci Series: ");
        int req=print_fib(n);
        System.out.print("The Fibonacci number at "+n+"th index :");
        System.out.print(req);
    }
}
