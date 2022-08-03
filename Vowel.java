import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character 
from the alphabet. Print Vowel or Consonant, depending on the user 
input. If the user input is not a letter (between a and z or A and Z), or is a 
string of length > 1, print an error message.*/
public class Vowel{
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int length=str.length();

        if(length>1){
            System.out.println("Enter a single character.");
        } else {
            switch (str) {
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    System.out.println("Entered character is vowel");
                    break;

                default:
                    System.out.println("Entered character is not vowel");
            }
    }
    }
}