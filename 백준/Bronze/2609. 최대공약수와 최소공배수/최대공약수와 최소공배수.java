import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = getGCD(num1, num2);

        System.out.println(gcd);
        System.out.println(((num1 * num2) / gcd));
    }

    static int getGCD(int num1, int num2) {
        if (num1%num2 == 0)
        {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}