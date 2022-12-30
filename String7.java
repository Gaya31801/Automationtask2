Task 7. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.

package Task2.String;
import java.lang.String;


public class String7 {
    public static void main(String[] args) {
        String str="Gayathri Ramanathan";
        String[] splited = str.split(" ");
        System.out.println(splited[1].charAt((0))+"."+splited[0]);
    }

}


