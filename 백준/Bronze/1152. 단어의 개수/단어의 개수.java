import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();

        if (str.isEmpty())
        {
            System.out.println("0");
        }
        else {
            String[] words = str.split("\\s+");
            System.out.println(words.length);
        }


    }
}