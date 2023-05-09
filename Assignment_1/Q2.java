/*
 * The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
human body fat in populations. It is computed by taking the individual's weight (mass) in 
kilograms and dividing it by the square of their height in meters. i.e.
Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
 */
package Assignment_1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter person Height in metres: ");
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        String out = "";
        if(bmi<18.5){
            out = "Underweight";
        }
        else if(bmi<24.9){
            out = "Normal Weight";
        }
        else if(bmi<29.9){
            out = "Overweight";
        }
        else{
            out = "Obese";
        }
        System.out.println("The person is " + out);
        sc.close();
    }
}
