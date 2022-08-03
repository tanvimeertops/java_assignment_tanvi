/*Write a program in Java to make such a pattern like right angle triangle 
with number increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10*/
public class Pattern1{
    public static void main(String[] args) {
        int i=0;
        for(int row=1;row<=4;row++){
            for(int col=1;col<=row;col++){
                i++;
                System.out.print(i);
            }
            System.out.println();
        }
    }
}