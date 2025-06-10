import java.util.*;
public class task15{
    public static void main(String[] args){
        int est_time=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight: ");
        int weight=sc.nextInt();
        System.out.print("Enter the level(L,M,H): ");
        char level=sc.next().charAt(0);
        if(weight == 0){
            est_time=0;
        }
        if(weight > 0 && weight <= 2000 && level == 'L'){
            est_time=25;
        }
        else if(weight > 2000 && weight <= 4000 && level == 'M'){
            est_time=35;
        }
        else if(weight > 4000 && weight <= 7000 && level == 'H'){
            est_time=45;
        }
        else if(weight > 7000){
            System.out.print("OVERLOADED");
        }
        else if(weight < 0 || level != 'L' && level != 'M' && level != 'H'){
            System.out.print("INVALID INPUT");
        }else{
             System.out.print("Time Estimated = "+ est_time +" Minutes");
        }
    }
}