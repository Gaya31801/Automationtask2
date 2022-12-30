Task 9:Write a program to print following :

1
222
33333



package Task2.Decisionmaking;

public class Pattern {
    public static void main(String[] args) {
        int i,j;
        int a=3;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
            

