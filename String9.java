Task 9. Write a program to delete all consonents from the string "Hello, have a good day".


package Task2.String;

import java.lang.String;

public class String9 {
    public static void main(String[] args) {
        String str = "Hello, have a good day";

    for (int i = 0; i < str.length(); i++)
    {
        if((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z'))
            if (str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'U' || str.charAt(i) == 'u' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i)== 'E' || str.charAt(i) == 'e' )
            {
                System.out.println( str.charAt(i));

            }


    }
}
}
