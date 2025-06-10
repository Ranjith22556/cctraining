//Find the min and max element in the given array
import java.util.*;
public class Collections1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter "+(i+1)+"th element:");
            int a= sc.nextInt();
            arr[i]=a;
        }
            System.out.print("The array is :");
            for(int i=0;i<5;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("\n");
            int min=arr[0];
            int max=arr[0];
            for(int i=0;i<5;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            System.out.println("Max="+max);
            System.out.println("Min="+min);
            sc.close();
    }
}