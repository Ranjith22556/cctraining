//Find the asc and desc of the given array
import java.util.*;
public class sec_lar_sec_small{
    public static void main(String[] args){
        int[] arr={10,30,14,28,90};
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
                }
            }
            System.out.println("The sec smallest:"+arr[1]);
            System.out.println("The sec largest:"+arr[n-2]);
        }
}

