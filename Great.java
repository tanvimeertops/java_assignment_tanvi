//Write a Java program to Take three numbers from the user and print the 
//greatest number.

import java.util.Scanner;

public class Great {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner a=new Scanner(System.in);
        int num1=a.nextInt();
        System.out.println("Enter the Second number:");
        int num2=a.nextInt();
        System.out.println("Enter the third number:");
        int num3=a.nextInt();
        if(num1>num2){
                if(num1>num3)
                        System.out.println("First number is greater");
                    else
                        System.out.println("Third number is greater");
        }
        else{
            if(num2>num3)
            System.out.println("Second number is greater");
        else
            System.out.println("Third number is greater");
        }
    }
}