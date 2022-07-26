import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        char Input;
        Scanner scan = new Scanner(System.in);
        Person[] person = new Person[20];
        int br = 0;

        do{
            System.out.println("\n--------Menu---------");
            System.out.println("1. Insert data.");
            System.out.println("2. Display all data.");
            System.out.println("3. Display data from inserted name.");
            System.out.println("s. Stop.");
            System.out.println("Input:");
            Input = scan.next().charAt(0);
            switch (Input) {
                case '1':
                    getData(person, br, scan);
                    br++;
                    break;
                case '2':
                    for(int i = 0; i < br; i++){
                        System.out.println("\nPerson N " + (i+1) + " :");
                        person[i].display();
                    }
                    break;
                case '3':
                    searchByName(person, br, scan);
                    break;
                default: System.out.println("\nWrong input!");
                    break;
            }
        }while(Input != 's');


        scan.close();
    }

    static void getData(Person person[], int br, Scanner scan){
        System.out.println();
        scan.nextLine();
        System.out.println("Insert name:");
        String name = scan.nextLine();
        System.out.println("Insert age:");
        int age = scan.nextInt();
        System.out.println("Insert heigh:");
        float heigh = scan.nextFloat();
        person[br] = new Person(name, age, heigh);
    }
    static void searchByName(Person person[], int br, Scanner scan){
        scan.nextLine();
        System.out.println("Insert name:");
        String new_name = scan.nextLine();
        for (int i = 0; i < br; i++) {
            if(new_name.equals(person[i].name)){
                person[i].display();
            }
        }
    }


}


