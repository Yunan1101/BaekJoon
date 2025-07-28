import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        double[] arr = new double[T]; // double로 선언

        for (int i = 0; i < T; i++) {
            arr[i] = scanner.nextDouble();
        }

        double max = arr[0];
        for (int i = 1; i < T; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < T; i++) {
            sum += (arr[i] / max) * 100.0; // 실수 연산
        }

        double avg = sum / T;
        System.out.println(avg);
    }
}
