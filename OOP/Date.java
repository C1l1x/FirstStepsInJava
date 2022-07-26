import java.util.Scanner;

public class Date {
    
    Integer day;
    Integer month;
    Integer year;
    
    Scanner scan;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    void display(){
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}
