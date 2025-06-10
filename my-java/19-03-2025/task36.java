import java.util.*;
import java.lang.Math;
public class task36{
    public static int findVal(int a,int b,int c){
        int s=a+b;
        int res=(int)Math.pow(s,3);
        return res;
    }
    public static void main(String[] args){
        int a=2;
        int b=3;
        int c=0;
        int res=findVal(a,b,c);
        System.out.print(res);
    }
}
