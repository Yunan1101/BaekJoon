import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt())
        {
            int a  = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);

            if (a == -1 || b == -1)
            {
                break;
            }
        }
    }
}