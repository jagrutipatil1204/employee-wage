package AssignmentDay5;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of times to flip coin: ");
        int n = sc.nextInt();

        int heads = 0, tails = 0;
        Random rand = new Random();

        // Loop to flip the coin n times
        for (int i = 0; i < n; i++) {
            if (rand.nextDouble() < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        // Calculate and print the percentage of heads and tails
        double headPercentage = (double) heads / n * 100;
        double tailPercentage = (double) tails / n * 100;
        System.out.println("Percentage of heads: " + headPercentage + "%");
        System.out.println("Percentage of tails: " + tailPercentage + "%");
    }
}
