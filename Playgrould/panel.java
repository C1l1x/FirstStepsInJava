import javax.swing.JOptionPane;

public class panel {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Insert name:");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age: "));
        JOptionPane.showMessageDialog(null, "Age: " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Insert height: "));
        JOptionPane.showMessageDialog(null, "Height: " + height);
    }
}
