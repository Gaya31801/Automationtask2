Task 10. Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence.


package Task2.String;


public class string10 {
    public static void main(String arg[]) {
        String message = "Gayathiri";
        String temp, initial = null;
        int i, j = 0, add = 0, othertemp = 0, maxioccurr = 0;
        String Number_of_occurence = null;
        for (i = 0; i < message.length(); i++) {
            for (j = 0; j < message.length(); j++) {
                temp = String.valueOf(message.charAt(j));
                initial = String.valueOf(message.charAt(i));
                if (initial.equals(temp)) {
                    add += 1;
                }
            }
            Number_of_occurence = "No.of " + (initial) + " : " + add;
            System.out.println(Number_of_occurence);
            maxioccurr = add;
            add = 0;
            if (maxioccurr > othertemp) {
                othertemp = maxioccurr;
            }
        }
        System.out.println("Maximum time occur letter is " + (initial) + " and the occurence count is " + maxioccurr);

    }

}
