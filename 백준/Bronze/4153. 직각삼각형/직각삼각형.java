import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            int a =  scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int a1 = a * a;
            int b1 = b * b;
            int c1 = c * c;

            if (a1 == 0 &&  b1 == 0 && c1 == 0)
            {
                break;
            }

            int max = Math.max(a, Math.max(b, c) );
            int sum = a * a + b * b + c * c - max * max;
            
            if (max * max == sum)
            {
                System.out.println("right");
            }
            else 
            {
                System.out.println("wrong");
            }

        }

    }
}
