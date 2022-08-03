public class Binary{
    public static void main(String[] args) {
        int n=25;
        int t=n;
        String bno=" ";
        while(t>0){
            int rem=t%2;
            t=t/2;
             bno=rem+bno;
        }
        System.out.println(bno);
    }
    
}