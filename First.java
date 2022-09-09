import java.util.Scanner;

/*access specifier/modifier
it gives the visibility and access of the member.
 * public
 * private
 * protected
 */
/*keyword 
 * super
 * this 
 * final 
 * static to call the static method there is no need to make d obj of d class
 * static always call when the class is called/execute.
 * java compiler first goes to the public class and then search for 
 * main method
 * object of the class.
 */
public class First {
    public static void main(String[] args) {
        int a;
       Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
               System.out.println("a="+a); 
    }
}
