import java.util.*;
public class task16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("1st number: ");
       int a=sc.nextInt();
       System.out.print("2nd number: ");
       int b=sc.nextInt();
       System.out.print("Select operator(+,-,*,/,%) : ");
       char op=sc.next().charAt(0);
       int c=0;
       switch (op) {
        case '+':
            c=a+b;
            System.out.print("The sum = "+c);
            break;
        case '-':
            c=a-b;
            System.out.print("The subtraction = "+c);
            break;
        case '*':
            c=a*b;
            System.out.print("The multiplication = "+c);
            break;
        case '/':
            if(b==0){
                System.out.println("Division by zero");
                break;
            }
            else{
            c=a/b;
            System.out.print("The division = "+c);
            break;
           }
        case '%':
            if(b!=0){
            c=a%b;
            System.out.print("The Remainder = "+c);
            break;
            }
            else{
                System.out.print("Modulo by zero");
            }
        default:
            System.out.print("Invalid Inputs");
            break;
       }
    }
}