import javax.swing.JOptionPane;

public class practice_2 {
    public static void main(String[] args) {
        int a = 10; 
        int b = -4;
        int c = 5;

        c = Math.max(a, b);
        System.out.println(c);
        c = Math.min(a, b);
        System.out.println(c);
        c = Math.incrementExact(b);
        System.out.println(c);

        a = Integer.parseInt(JOptionPane.showInputDialog("Insert any number!"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insert any number!"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Insert any number!"));
        int y = 0;
        y = Math.max(y, a);
        y = Math.max(y, b);
        y = Math.max(y, c);
        JOptionPane.showMessageDialog(null, "Max value is: " + y + ".");

    }
}
