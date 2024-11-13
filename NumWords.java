// Prints a given number using hundreds, tens, and ones notation.

public class NumWords {

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        num = num / 10;
        int hundreds = num % 10;

        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

        //int[] digits = new int[3];
        // for (int i = 0; i < 3; i++) {
        //     digits[i] = num % 10;  
        //     num = num / 10;        
        // }
        //System.out.println(digits[2] + " hundreds, " + digits[1] + " tens, and " + digits[0] + " ones.");
    }
}
