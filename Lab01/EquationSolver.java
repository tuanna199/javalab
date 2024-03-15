import javax.swing.JOptionPane;

public class EquationSolver {

    public static void main(String[] args) {
        String[] options = {"First-degree equation with one variable", "System of first-degree equations with two variables", "Second-degree equation with one variable"};
        int option = JOptionPane.showOptionDialog(null, "Choose an option:", "Equation Solver", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (option) {
            case 0:
                solveFirstDegreeEquation();
                break;
            case 1:
                solveLinearSystem();
                break;
            case 2:
                solveSecondDegreeEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option");
        }
    }

    public static void solveFirstDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient of x:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant:"));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Infinite solutions");
            } else {
                JOptionPane.showMessageDialog(null, "No solution");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
    }

    public static void solveLinearSystem() {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient a1 for the first equation:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient b1 for the first equation:"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant c1 for the first equation:"));

        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient a2 for the second equation:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient b2 for the second equation:"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant c2 for the second equation:"));

        double determinant = a1 * b2 - a2 * b1;
        double determinantX = c1 * b2 - c2 * b1;
        double determinantY = a1 * c2 - a2 * c1;

        if (determinant == 0) {
            if (determinantX == 0 && determinantY == 0) {
                JOptionPane.showMessageDialog(null, "Infinite solutions");
            } else {
                JOptionPane.showMessageDialog(null, "No solution");
            }
        } else {
            double x = determinantX / determinant;
            double y = determinantY / determinant;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x + ", y = " + y);
        }
    }

    public static void solveSecondDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient of x^2:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient of x:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant:"));

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(null, "Infinite solutions");
                } else {
                    JOptionPane.showMessageDialog(null, "No solution");
                }
            } else {
                double root = -c / b;
                JOptionPane.showMessageDialog(null, "The solution is x = " + root);
            }
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The solutions are x = " + root1 + " and x = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The double root is x = " + root);
        } else {
            JOptionPane.showMessageDialog(null, "No real roots");
        }
    }
}
