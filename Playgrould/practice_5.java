import java.util.Scanner;

public class practice_5 {
    static void getData(String[] name, int[] age, float[] heigh){

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner textscan = new Scanner(System.in);
        char Input;
        String name[] = new String[50];
        int[] age = new int[50];
        float[] heigh = new float[50];
        int br = 0;
        
        do{
            System.out.println("\n----MENU----");
            System.out.println("1. Insert data.");
            System.out.println("2. Display data.");
            System.out.println("3. Display data from inserted name.");
            System.out.println("s. For exit.");
            System.out.println("Input: ");
            Input = scan.next().charAt(0);

            switch (Input) {
                case '1':
                    System.out.println();
                    scan.nextLine();
                    System.out.println("Insert name:");
                    //name = textscan.nextLine();
                    name[br] = scan.nextLine();
                    System.out.println("Insert age:");
                    age[br] = scan.nextInt();
                    System.out.println("Insert heigh:");
                    heigh[br++] = scan.nextFloat();
                    break;
                case '2': 
                    for(int i = 0; i < br; i++){
                        System.out.println();
                        System.out.println("Name: " + name[i]);
                        System.out.println("Age: " + age[i]);
                        System.out.println("Heigh: " + heigh[i]);
                    }
                    break;
                case '3': 
                    scan.nextLine();
                    System.out.println("Search by name:");
                    String newname = scan.nextLine();
                    for(int i = 0; i < br; i++){
                        if(name[i].equals(newname)){
                            System.out.println();
                            System.out.println("Name: " + name[i]);
                            System.out.println("Age: " + age[i]);
                            System.out.println("Heigh: " + heigh[i]);
                        }
                    }
                    break;

                default: System.out.println("\nWrong Input!");
                    break;
            }
        }while(Input != 's');
        scan.close();
        //textscan.close();
    }
}
