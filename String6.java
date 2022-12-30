Task 6. Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".



package Task2.String;
import java.lang.String;


public class String6 {
    public static void main(String[] args) {
        String value = "Hello, World";
        for (int i = 0; i < value.length(); i++) {
            switch (value.charAt(i)) {
                case 'o':
                    if (value.charAt(i) == value.charAt(0)) {
                        System.out.println("First occurence is the same input you gave " + value.charAt(i));
                        System.out.println("Last occurence of o is " + value.charAt(i + 1));
                    } else if (value.charAt(i) == value.charAt(value.length() - 1)) {
                        System.out.println("Last occurence is the same input you gave" + value.charAt(i));
                        System.out.println("First occurence of o is " + value.charAt(i - 1));
                    } else {
                        System.out.println("First occurence of o is " + value.charAt(i - 1));
                        System.out.println("Last occurence of o is " + value.charAt(i + 1));
                        break;
                    }
                case ',':
                    if (value.charAt(i) == value.charAt(0)) {
                        System.out.println("First occurence is the same input you gave " + value.charAt(i));
                        System.out.println("Last occurence of , is " + value.charAt(i + 1));
                    } else if (value.charAt(i) == value.charAt(value.length() - 1)) {
                        System.out.println("Last occurence is the same input you gave" + value.charAt(i));
                        System.out.println("First occurence of , is " + value.charAt(i - 1));
                    } else {
                        System.out.println("First occurence of , is " + value.charAt(i - 1));
                        System.out.println("Last occurence of , is " + value.charAt(i + 1));
                        break;
                    }

            }
        }
    }
}


