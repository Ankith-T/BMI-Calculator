import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner numericalScanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weightPounds = numericalScanner.nextDouble();
        System.out.println("Enter Feet of height:");
        double feetHeight = numericalScanner.nextDouble();
        System.out.println("Enter Inches of height:");
        double inchHeight = numericalScanner.nextDouble();

        weightPounds *= 0.45359237;
        feetHeight *= 12;
        double totalHeightInch = feetHeight + inchHeight;
        totalHeightInch /= 39.37;
        double bmiCalculation = weightPounds/(Math.pow(totalHeightInch, 2));
        System.out.println("BMI is " +bmiCalculation);

        if (bmiCalculation < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmiCalculation <25){
            System.out.println("Normal");
        }
        else if (bmiCalculation < 30){
            System.out.println("Overweight");
        }
        else if (bmiCalculation >= 30){
            System.out.println("Obese");
        }







    }
}
