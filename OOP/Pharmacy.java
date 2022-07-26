import java.util.Scanner;

/*
Да се състави програма, която съхранява в масив следната информация за лекарствата в една аптека:
    - наименование символен низ;
    - цена - реално число;
    - налично количество - цяло число;
    - дата, до която е годно за употреба;

    и извършва следните операции, избрани от меню:
    - добавя към масива данните на ново лекарство;
    - извежда всички въведени данни;
    - извежда имената на лекарствата с цена над 5 лв.;
    - създава нов масив с данните на лекарствата с налични количества под 10 броя;
    - създава нов масив с имената на лекарствата с изтичащ срок на годност на зададена дата.

Забележка:
Създайте клас за опериране с дата, който да използвате като член данни за срок на годност.
*/

public class Pharmacy {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Medicaments[] medicaments = new Medicaments[20];
        Date[] date = new Date[20];
        char Input;
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
                    getData(br, medicaments, scan, date);
                    br++;
                    break;
                case '2':
                    for(int i = 0; i < br; i++){
                        System.out.println("\nMedicament N " + (i+1) + " :");
                        medicaments[i].display();
                    }
                    break;
                case '3':
                    
                    break;
                default: System.out.println("\nWrong input!");
                    break;
            }
        }while(Input != 's');


        scan.close();
    }

    static void getData(int br, Medicaments medicaments[], Scanner scan, Date date[]){
        System.out.println();
        scan.nextLine();
        System.out.println("Insert medicament name:");
        String name = scan.nextLine();
        System.out.println("Insert price:");
        float price = scan.nextFloat();
        System.out.println("Insert count:");
        int count = scan.nextInt();
        System.out.println("Insert day:");
        int day = scan.nextInt();
        System.out.println("Insert month:");
        int month = scan.nextInt();
        System.out.println("Insert year:");
        int year = scan.nextInt();
        medicaments[br] = new Medicaments(name, price, count);
        date[br] = new Date(day, month, year);
    }
}
