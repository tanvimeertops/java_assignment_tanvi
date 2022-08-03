
import java.time.format.DateTimeFormatter;

public class Time{
    public static void main(String[] args) {
        DateTimeFormatter date=DateTimeFormatter.ofPattern("HH:mm:ss");
        //LocalDateTime now=LocalDateTime.now();
        System.out.println(java.time.LocalDateTime.now().format(date));
}
}