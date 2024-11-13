// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int randomNum1 = (int) (Math.random() * lim);
        int randomNum2 = (int) (Math.random() * lim);
        int randomNum3 = (int) (Math.random() * lim);

        while (randomNum1 == randomNum2 || randomNum1 == randomNum3 || randomNum2 == randomNum3) {
            randomNum1 = (int) (Math.random() * (lim));
            randomNum2 = (int) (Math.random() * (lim));
            randomNum3 = (int) (Math.random() * (lim));
        }

        int max = Math.max(Math.max(randomNum1, randomNum2), randomNum3);
        int min = Math.min(Math.min(randomNum1, randomNum2), randomNum3);

        int middle = randomNum1 + randomNum2 + randomNum3 - (max + min);

        System.out.println(randomNum1 + " "
                + randomNum2 + " "
                + randomNum3);
        System.out.println(min + " "
                + middle + " "
                + max);
    }
}
