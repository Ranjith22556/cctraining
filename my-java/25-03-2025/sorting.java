//Find the asc and desc of the given array
import java.util.*;
public class sorting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int temp=0;
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            int a= sc.nextInt();
            arr[i]=a;
        }
            System.out.print("The array is :");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("\n");
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.print("Ascending Order : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("\n");
             for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.print("Descending Order: ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            sc.close();
    }
}
