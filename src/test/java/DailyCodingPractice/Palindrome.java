package DailyCodingPractice;

public class Palindrome {

    public static void main(String[] args) {

        String name = "Civic";
        String reversed="";


        for(int i=name.length()-1; i>=0; i--){

            reversed+=name.charAt(i);

        }

        if(name.equalsIgnoreCase(reversed)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }
    }
}


