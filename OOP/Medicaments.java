import java.util.Scanner;

public class Medicaments {
    
    String name;
    Float price;
    Integer count;
    Date date;
    Scanner scan;
    public Medicaments(String name, float price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Count: " + count);
        date.display();
    }
}
