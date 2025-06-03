package DailyCodingPractice;

import java.util.ArrayList;

public class SplitIntoOddAndEvenP2 {

    public static void main(String[] args) {

        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        ArrayList<Integer> evenNumber =  new ArrayList<Integer>();
        ArrayList<Integer> oddNumber = new ArrayList<Integer>();


        for(int i=0; i<numbers.length; i++){

            if(numbers[i]%2==0){
                evenNumber.add(numbers[i]);

            }
            else {
                oddNumber.add(numbers[i]);

            }

        }

        System.out.println("Even numbers: "+evenNumber);
        System.out.println("Odd numbers: "+oddNumber);

    }
}
