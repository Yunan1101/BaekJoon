import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int floor = N % H;
            int room = N / H + 1;

            if (floor == 0)
            {
                floor = H;
                room = N / H;
            }

            System.out.printf("%d%02d\n", floor, room);
        }

    }
}