import java.util.Scanner;

public class readingarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter "+(n)+" Elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Printing the array : ");
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }
    }
}
