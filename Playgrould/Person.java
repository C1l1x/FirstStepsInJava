import java.util.Scanner;

public class Person {
    String name;
    int age;
    float heigh;
    Scanner scan = new Scanner(System.in);

    Person(String name, int age, float heigh){
        this.name = name;
        this.age = age;
        this.heigh = heigh;
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heigh: " + heigh);
    }
}
