import java.util.Scanner;

/*datatype
 * int
 * char
 * float
 * long int
 * string
 * double
 */
public class BasicSyntax {
    
    public static void main(String[] args) {
        long  a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextLong();
        System.out.println("Enter b:");
        b=sc.nextFloat();
        float sum=a+b;
        System.out.println("sum:"+sum);
    }
}
