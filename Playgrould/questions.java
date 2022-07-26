import java.util.Random;
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String stop = "";
        Random random = new Random();

        do{
            boolean a = random.nextBoolean();
            System.out.println("True or false.");
            System.out.print("Q: ");
            stop = Input.nextLine();
            System.out.println("A: " + a + "\n");
        }
        while(!stop.equals("s"));
        System.out.println("Good Bye\n");
        Input.close();
    }
    
}
