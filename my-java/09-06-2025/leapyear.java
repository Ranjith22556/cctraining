import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year<0){
            System.out.println("INVALID YEAR");
        }
        else if(year%4==0){
            if(year%100==0 && year%400==0){
                System.out.println("LEAP YEAR");
            }
            if(year%100==0 && year%400!=0){
                System.out.println("NOT A LEAP YEAR");
            }
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
