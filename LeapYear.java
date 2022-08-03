import java.time.Year;
import java.util.Scanner;

/*Write a Java program that takes a year from user and print whether that 
year is a leap year or not*/
public class LeapYear{
public static void main(String[] args) {
   System.out.println("Enter the year"); 

   Scanner sc=new Scanner(System.in);
    int  year=sc.nextInt();
    if(year%4==0){
        System.out.println("leap year");
    }else{
        System.out.println("Not a leap year");
    }
}
}