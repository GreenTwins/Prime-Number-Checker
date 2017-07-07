package loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Foglea on 6/7/2017.
 */
public class PrimeChecker {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("This program checks to see if the input number is a prime number ");
            System.out.println("Please input number:  ");
            input = br.readLine();
            int number = Integer.parseInt(input);
            if (number == 2) {
                System.out.println(number + "  is a prime number ");

            } else if (number % 2 == 0) {//takes out even numbers since even numbers cant be prime
                System.out.println(number + "  is not a prime number ");
            } else {//to find the square root of the number to see if its truly prime
                int maxCount = (int) Math.ceil(Math.sqrt(number));//math.sqrt(number) give the square root of the number. Math.ceil to find a number that is larger than the (number)
                boolean isPrime = true;
                for (int count = 3; count <= maxCount; count = count + 2) {// use 3 b.c 1 and 2 are prime but dont count. only look for odd b.c the evens were taken out
                    if (number % count == 0) {//if any number is a factor that given number isn't prime so "break" and leave the loop and go to else
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(number + "  is a prime number ");
                } else {
                    System.out.println(number + "  is not a prime number ");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
