Task 5. Write a program to check if the word 'orange' is present in the "This is orange juice".


package Task2.String;

public class String5 {
    public static void main(String[] args) {
        String str = "This is orange juice";
        if (str.contains("orange")) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }

    }
}

