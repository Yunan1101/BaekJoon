import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        int count = 0;
        boolean [] mod = new boolean[42];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            int digit = arr[i] % 42;
            if(!mod[digit])
            {
                mod[digit] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}