import java.util.*;
public class task25{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
       System.out.print("The sum of first "+n+" natural numbers = ");
       while(i<=n){
        sum=sum+i;
        System.out.print(i);
        if(i<n){
            System.out.print(" + ");
        }
        else{
            System.out.print(" = ");
        }
        i++;
       }
       System.out.print(sum);
    }
}