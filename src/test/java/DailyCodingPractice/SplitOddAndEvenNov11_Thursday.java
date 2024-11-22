package DailyCodingPractice;

import java.util.ArrayList;

public class SplitOddAndEvenNov11_Thursday {

    public static void main(String[] args) {


        ArrayList<Integer> oddNums = new ArrayList<Integer>();
        ArrayList<Integer> evenNums = new ArrayList<Integer>();


        int[] numbers = {11, 2, 34, 23, 45, 67, 90, 23, 45, 54, 32};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                evenNums.add(numbers[i]);

            } else {

                oddNums.add(numbers[i]);
            }
        }

        System.out.println("Odd number: "+oddNums);
        System.out.println("Even number: "+evenNums);
    }
}

