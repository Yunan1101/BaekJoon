import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        for (int j = 0; j<N; j++)
        {
            int n =  sc.nextInt();
            for (int i=2;i<=n;i++)
            {
                arr[i][0] = arr[i-1][0] + arr[i-2][0];
                arr[i][1] = arr[i-1][1] + arr[i-2][1];
            }
            System.out.println(arr[n][0] + " "+arr[n][1]);
        }

    }
}