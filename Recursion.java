public class Recursion{
   public static int f(int fact){
        if(fact==0||fact==1)
            return 1;
        
        else
        return (fact*f(fact-1));
    }
    public static void main(String[] args) {
        int fact=5;
        int i=fact-1;
        while(i>=1){
            fact=fact*i;
        i--;
        }
        System.out.println("factorial of "+fact+" is "+f(fact)); 
    }
    
}