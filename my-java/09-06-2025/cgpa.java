import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CGPA:");
        float cgpa=sc.nextFloat();
        if(cgpa>10 || cgpa<0){
            System.out.println("Invalid CGPA");
        }
        else if(cgpa>7.5){
            System.out.println("TOP");
        }
        else if(6.5<cgpa && cgpa<7.4){
            System.out.println("GOOD");
        }
        else if(5.5<cgpa && cgpa<6.4){
            System.out.println("AVERAGE");
        }
        else{
            System.out.println("POOR");
        }
    }
}
