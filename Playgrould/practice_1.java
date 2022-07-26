import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Insert name: ");
        String name = Input.nextLine();
        System.out.println("Insert age: ");
        int age = Input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        Input.close();
    }
}