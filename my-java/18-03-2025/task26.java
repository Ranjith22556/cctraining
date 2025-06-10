//Write a program to read print the "welcome to the do while loop" getting message using do while loop.
//Just get the nnumber n as an input and print the message n times.
import java.io.*;
public class task26{
    public static void main(String[] args) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number (N):");
        int n = Integer.parseInt(rd.readLine());
        int count=0;
        do{
            System.out.println("Welcome to the do while loop");
            count++;
        }while(count<n);
    }
}