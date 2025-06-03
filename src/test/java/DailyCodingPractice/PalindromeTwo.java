package DailyCodingPractice;

public class PalindromeTwo {

    public static void main(String[] args) {

        String word = "civijjC";
        String reversed = "";


        for(int i=word.length()-1; i>=0; i--){

            reversed += word.charAt(i);

        }

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is NOT a palindrome");
        }

    }
}
