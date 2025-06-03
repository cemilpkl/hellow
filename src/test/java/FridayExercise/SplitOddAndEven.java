package FridayExercise;

import java.util.ArrayList;

public class SplitOddAndEven {

    public static void main(String[] args) {

        int [] numbers = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){

            if (numbers[i] % 2 == 0) {

                evenNumbers.add(numbers[i]);
            }
            else{
                oddNumbers.add(numbers[i]);
            }
        }

        System.out.println("These are even numbers: "+ evenNumbers);
        System.out.println("These are odd numbers: "+ oddNumbers);
    }
}

