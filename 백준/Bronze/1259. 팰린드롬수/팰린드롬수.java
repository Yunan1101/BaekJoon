import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            String num = scanner.nextLine();
            if (num.equals("0"))
            {
                break;
            }
            String reversed = new StringBuilder(num).reverse().toString();

            if (num.equals(reversed))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
