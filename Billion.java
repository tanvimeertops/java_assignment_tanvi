import java.util.Scanner;

/*Write a Java program that reads a positive integer and count the number 
of digits the number.
Input an integer number less than ten billion: 125463 Number of digits in 
the number: 6*/
public class Billion{
    public static void main(String[] args) {
        long amount;
        int cnt=0;
        long no=10000000000L;
        System.out.println("Enter the number less than 10 billion:");
        Scanner sc=new Scanner(System.in);
        amount=sc.nextLong();
        
       if(amount<no){
          while(amount>0){
            amount=amount/10;
          cnt++;
          }
          System.out.println(cnt);

        }else{
          System.out.println("Input an integer number less than ten billion");
        }
        
    }
  }
