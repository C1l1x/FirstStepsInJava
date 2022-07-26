import java.util.Scanner;

public class practice_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner textscan = new Scanner(System.in);
        char Input;
        String name = "";
        int age = 0;
        float heigh = 0.00f;
        
        do{
            System.out.println("\n----MENU----");
            System.out.println("1. Insert data.");
            System.out.println("2. Display data.");
            System.out.println("s. For exit.");
            System.out.println("Input: ");
            Input = scan.next().charAt(0);

            switch (Input) {
                case '1':
                    System.out.println();
                    scan.nextLine();
                    System.out.println("Insert name:");
                    //name = textscan.nextLine();
                    name = scan.nextLine();
                    System.out.println("Insert age:");
                    age = scan.nextInt();
                    System.out.println("Insert heigh:");
                    heigh = scan.nextFloat();
                    break;
                case '2': 
                    System.out.println();
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Heigh: " + heigh);
        
                default:
                    break;
            }
        }while(Input != 's');
        scan.close();
        //textscan.close();
    }
}
