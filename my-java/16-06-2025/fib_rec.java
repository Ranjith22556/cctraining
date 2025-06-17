
public class fib_rec {
    public static void main(String[] args){
        int num=9;
        int result=fib_dp(num);
        System.out.println(result);
    }
    public static int fib(int n){
        if (n==0||n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static int fib_dp(int n){
        int a=0;
        int b=1;
        int c=0;
        int i=0;
        while(i<n-2){
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}
