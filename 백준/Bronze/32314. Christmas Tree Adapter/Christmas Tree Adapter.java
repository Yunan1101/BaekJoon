import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int div, a , b;
        div = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        if ( div <= a / b)
        {
            System.out.println("1");
        }
        else
            {
            System.out.println("0");
            }
    }
}