Task 7:Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. (Hint : Learn concept on net and do it on your own)


package Task2.Decisionmaking;

import java.util.Scanner;

public class Prime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int a = sc.nextInt();
            boolean flag=false;
            for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=true;
                break;
            }
            }
            if(!flag){
                System.out.println(a+" Prime number");
            }
            else{
                System.out.println(a+" Not a prime number");
            }
        }
        }
