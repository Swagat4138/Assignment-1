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
    }
}
