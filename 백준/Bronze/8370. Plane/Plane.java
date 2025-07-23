import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d,result1,result2;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        result1 = a * b;
        result2 = c * d;

        System.out.println(result1 + result2);
    }
}