import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int A, B, C;
        System.out.print("Hello and welcome!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A: ");
        A = input.nextInt();

        System.out.println("Enter B: ");
        B = input.nextInt();

        System.out.println("Enter C: ");
        C = input.nextInt();

        String output = String.format("%d + %d + %d = %d", A, B, C, A + B + C);
        System.out.println(output);
    }
}