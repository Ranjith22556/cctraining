import java.util.*;
public class task24{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        System.out.print("The Series of numbers : ");
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        i=1;
        System.out.print("The Squares of numbers: ");
        while(i<=n){
            System.out.print((i*i)+" ");
            i++;
        }
        System.out.println();
        System.out.print("The Cubes of numbers  : ");
        int j=1;
        while(j<=n){
            System.out.print((j*j*j)+" ");
            j++;
        }
        }
    }
