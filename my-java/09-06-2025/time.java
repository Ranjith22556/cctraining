import java.util.Scanner;
public class time{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Time in Railway Format:");
        int time=sc.nextInt();
        if(time>0 && time<12){
            System.out.println("Good Morning");
        }
        else if(time>=13 && time<=17){
            System.out.println("Good Afternoon");
        }
        else if(time>=18 && time<=19){
            System.out.println("Good Evening");
        }
        else if(time>=20 && time<24){
            System.out.println("Good Night");
        }
        else{
            System.out.println("INVALID TIME");
        }
    }
}