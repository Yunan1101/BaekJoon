import java.util.Scanner;

public class Main {
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        int len = String.valueOf(num).length();
        int start = num - 9 * len;
        if (start < 1)
        {
            start = 1;
        }
        for (int i = start; i < num; i++) {
            if (i + digitSum(i) == num) {
                result = i;
                break; // 가장 작은 생성자 찾으면 종료
            }
        }

        System.out.println(result);
    }
}
