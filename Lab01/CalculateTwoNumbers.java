import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args){
        
        // Input the first number
        String str_num1 = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(str_num1);

        // Input the second number
        String str_num2 = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(str_num2);

        // Calculate and display sum
        double sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Sum: " + sum);

        // Calculate and display difference
        double difference = num1 - num2;
        JOptionPane.showMessageDialog(null, "Difference: " + difference);
        
        // Calculate and display product
        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, "Product: " + product);

        // Check if the second number is not zero before calculating quotient
        if (num2 != 0) {
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "Quotient: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero.");
        }        
    }
}