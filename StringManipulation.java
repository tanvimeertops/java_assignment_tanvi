/*Write a Java program to count the letters, spaces, numbers and other 
characters of an input string.*/
public class StringManipulation{
    public static void main(String[] args) {
        String str=" Hello World 123???";
        count(str);

    }
    public static void count(String x){
        char ch[]=x.toCharArray();
        int digit=0,space=0;
        int letter=0,splChar=0;
        for(int i=0;i<x.length();i++){
        if(Character.isDigit(ch[i])){
            digit++;
        }else if(Character.isLetter(ch[i])){
            letter++;
        }else if(Character.isSpaceChar(ch[i])){
            space++;
        }else{
            splChar++;
        }
    }
        System.out.println("Given String "+x+" has "+digit+" digit and " +letter+" letter and "+splChar+" special character and "+space+" space");   
    }
}