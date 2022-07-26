import java.util.Scanner;

public class practice_3 {
    public static void main(String[] args) {
        float x;
        float y;
        double z;

        Scanner Input = new Scanner(System.in);

        System.out.print("\nInsert x: ");
        x = Input.nextFloat();
        System.out.print("Insert y: ");
        y = Input.nextFloat();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("\nHypotenuse is " + z + "\n");

        Input.close();
    }
}