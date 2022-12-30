Task 8. Write a program to find the number of vowels, consonents, digits and white space characters in a string.


package Task2.String;

import java.util.List;

public class String8 {
    public static void main(String arg[]) {
        String value = "I am Gayathri born on July 18";
        int countwithspace = value.length();

        int i;
        int countvowel = 0;
        int countcons = 0;
        int countdigit = 0;
        String vowels = "aeiou";

        List<String> consanants = List.of(value.split(" "));
        int countspace = consanants.size() - 1;
        System.out.println("No.of space :" + countspace);


        String trimmed = value.replace(" ", "").toLowerCase();
        int countwithoutspace = trimmed.length();
        System.out.println("No.of characters before removing spaces:" + countwithspace);
        System.out.println("No.of characters after removing spaces:" + countwithoutspace);
        //System.out.println(trimmed);

        for (i = 0; i < trimmed.length(); i++) {
            if (vowels.contains(String.valueOf(trimmed.charAt(i)))) {
                countvowel += 1;
            } else if (Character.isDigit(trimmed.charAt(i))) {
                countdigit += 1;
            } else {
                //System.out.println(trimmed.charAt(i));
                countcons += 1;
            }

        }
        System.out.println("No.of vowels: " + countvowel);
        System.out.println("No.of Cons: " + countcons);
        System.out.println("No.of digit: " + countdigit);


    }
}
