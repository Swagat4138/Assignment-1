/*
 * Write a java program to check whether a number is a spy number or not.
 */
package Assignment_1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        int sum = 0 ,product = 1 ,n=x;
        while(x>0){
            int r = x%10;
            sum+=r;
            product+=r;
        }
        if(sum==product){
            System.out.println(n+ " is a spy number");
        }
        else{
            System.out.println(n+ " is not a spy number");
        }
        sc.close();
    }
}
