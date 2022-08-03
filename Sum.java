import java.util.Scanner;

/*Write a program in Java to input 5 numbers from keyboard and find their 
sum and average using for loop*/
public class Sum{
    
    public static void main(String[] args) {
        int[] num=new int[10];
        int sum=0;
        System.out.println("Enter 5 number:");
        Scanner sc= new Scanner(System.in);
        
        for(int i=1;i<=5;i++){
            num[i]=sc.nextInt();
        
        sum=sum+num[i];
        }
        System.out.println("Sum:"+sum);
        int average=sum/5;
        System.out.println("average:"+average);
    }
}