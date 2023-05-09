/*
 * Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
 */
package Assignment_1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter positive integer larger than 2: ");
        int x = sc.nextInt();
        int count = 0;
        while(x>2){
            count++;
            x/=2;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+ count);
        sc.close();
    }
}
