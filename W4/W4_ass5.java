import javax.swing.JOptionPane;

public class W4_ass5 
{

    public static void main(String[] args) {

        double wages, rate, hours;

        String hoursInput = JOptionPane.showInputDialog("Enter the working hours:");
        hours = Double.parseDouble(hoursInput);

        String rateInput = JOptionPane.showInputDialog("Enter the pay rate:");
        rate = Double.parseDouble(rateInput);

        if (hours > 40.0)
            wages = 40.0 * rate + 1.5 * rate * (hours - 40.0);
        else
            wages = hours * rate;

        String message = String.format("The wages are $%.2f", wages);
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}