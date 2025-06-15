
import java.util.Arrays;
public class binarysearch {
    public static void main(String[] args) {
        int a[]=new int[3];
        System.out.println("Initial Values= "+a[0]+"\t"+a[1]+"\t"+a[2]);
        Arrays.fill(a,190);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        int k=Arrays.binarySearch(a,190);
        System.out.println("Index="+k);
        if(k<0) System.out.println("Not Found");
        else System.out.print("Yes found at "+k);
    }
}
