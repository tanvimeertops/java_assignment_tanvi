public class PatternABC{
    public static void main(String[] args) {
        int alpha=63;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print((char)(alpha+col+1));
                //alpha++;
            }
            System.out.println(" ");
        }
    }
}