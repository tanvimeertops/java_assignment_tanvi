import java.util.Scanner;

/*Write a Java program that accepts an integer (n) and computes the value 
of n+nn+nnn.
Input number: 5
5 + 55 + 555*/

public class compute{
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner sc=new Scanner(System.in);
        String no=sc.next();
        
        System.out.println(no+"+"+no+no+"+"+no+no+no);
    }
}