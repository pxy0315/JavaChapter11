//完全平方

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m:");
        int m = input.nextInt();
        int mTemp = m;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= m; ) {
            if (m % i == 0 && isPrime(i)) {
                list.add(i);
                m /= i;
                i = 2;
            } else {
                i++;
            }
        }


        int[] divisor = new int[list.get(list.size() - 1) + 1];

        for (int i = 0; i < list.size(); i++) {
            divisor[list.get(i)]++;
        }

        int n = 1;
        for (int i = 0; i < divisor.length; i++) {
            if (divisor[i] % 2 == 1) {
                n *= i;
            }
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (mTemp * n));

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;

	}

}
