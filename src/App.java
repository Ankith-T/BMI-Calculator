import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner numericalScanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds (e.g., 150):");
        double weightPounds = numericalScanner.nextDouble();
        System.out.println("Enter height in feet (e.g., 5):");
        double feetHeight = numericalScanner.nextDouble();
        System.out.println("Enter additional height in inches (e.g., 10):");
        double inchHeight = numericalScanner.nextDouble();
        if (weightPounds <= 0 || feetHeight < 0 || inchHeight < 0 || inchHeight >= 12) {
            System.out.println("Invalid input. Please ensure weight is positive and inches are between 0 and 11.");
        
        }
        numericalScanner.close();
    
        weightPounds *= 0.45359237;
        feetHeight *= 12;
        double totalHeightInch = feetHeight + inchHeight;
        double totalHeightMeters = totalHeightInch * 0.0254;
        double bmiCalculation = weightPounds/(Math.pow(totalHeightMeters, 2));
        System.out.printf("BMI is %.2f%n", bmiCalculation);

        if (bmiCalculation < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmiCalculation <25){
            System.out.println("Normal");
        }
        else if (bmiCalculation < 30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }


    
    }
}