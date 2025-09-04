import java.util.Scanner;

public class TextCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter some text: ");
        String text = sc.nextLine();

        String upper = text.toUpperCase();

        String lower = text.toLowerCase();

        // Display results
        System.out.println("Original Text: " + text);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
}
