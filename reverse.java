Task 6: Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.  (Hint : Learn concept on net and do it on your own)


package Task2.Decisionmaking;

import java.util.Scanner;

public class Reverse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int a = sc.nextInt();
            int rev=0;
            while(a!=0){
                int rem=a%10;
                rev=rev*10+rem;
                a=a/10;
            }
            System.out.println("The reversed number: "+rev);
        }

}
