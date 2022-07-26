import java.util.Scanner;

public class Date {
    
    Integer day;
    Integer month;
    Integer year;
    
    Scanner scan;
    
    public Date(){
        scan = new Scanner(System.in);
        System.out.println("Insert day:");
        day = scan.nextInt();
        System.out.println("Insert month:");
        month = scan.nextInt();
        System.out.println("Insert year:");
        year = scan.nextInt();
    }
}
