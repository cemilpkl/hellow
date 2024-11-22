package DailyCodingPractice;

import java.util.Scanner;

public class CalculateMyAgeWithScanner {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current year");
        int currentYear = scanner.nextInt();

        System.out.println("Enter your date of birth");
        int DOB = scanner.nextInt();

        int myAge = calculateMyAge(currentYear, DOB);

        System.out.println("Your age is: "+myAge );

    }

    public static int calculateMyAge(int currentYear, int DOB ){
        return (currentYear - DOB);
    }
}
