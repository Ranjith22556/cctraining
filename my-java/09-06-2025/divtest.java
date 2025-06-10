import java.util.Scanner;
public class divtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b=sc.nextInt();
        int sum=a+b;
        if(sum%2==2){
            System.out.println("The sum is Even");
        }
        else{
            System.out.println("The sum is Odd");
        }
    }
}
