package DailyCodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitOddAndEven {

    public static void main(String[] args) {

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        int [] numbers = {11, 34, 56, 67, 89, 90,12, 3, 34, 65, 32 };

        for(int i=0; i<numbers.length; i++){

            if(numbers[i]% 2==0){
                evenNumbers.add(numbers[i]);
            } else {
                oddNumbers.add(numbers[i]);
            }
        }


        System.out.println("Even numbers: "+evenNumbers);
        System.out.println("Even numbers: "+oddNumbers);


    }
}
