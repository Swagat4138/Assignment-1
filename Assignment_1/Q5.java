/*
 * Write a java method to calculate the sum of digits of a given number until the number is a 
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
 */
package Assignment_1;
import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n +"until the number is a single digit is "+ sum_0f_Digits(n));
        sc.close();
    }

    public static int sum_0f_Digits(int n) {
        int sum= 0;
        while(n>0){
            int r = n%10;
            sum+=r; 
            n/=10;
        }
        if(sum>=10){
            return sum_0f_Digits(sum);
        }
        else{
            return sum;
        }
    }
}
