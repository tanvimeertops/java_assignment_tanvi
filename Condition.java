import java.util.Scanner;

public class Condition{
    public static void main(String[] args) 
    {
        float percentage;
   System.out.println("Enter your percentage:");
 Scanner sc=new Scanner(System.in);
 percentage=sc.nextInt();
  if(percentage>=75)
  {
                    
    System.out.println("Distinction");
        }else if(percentage<75&&percentage>=60)
                        {
                            System.out.println("First class");
                        }
                            else if(percentage<60&&percentage>=45)
                                {
                                    System.out.println("Second class");
                                }
      else if(percentage>=35)
      {
    System.out.println("third class");
    }else{
        System.out.println("Fail");
    }

}
}