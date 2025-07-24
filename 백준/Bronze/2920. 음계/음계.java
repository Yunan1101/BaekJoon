import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;
        for  (int i = 0; i < 7; i++) {
            if (arr[i] < arr[i+1])
            {
               descending = false;
            }
            else if (arr[i] > arr[i+1])
            {
                ascending = false;
            }
        }
        if (ascending) {
            System.out.println("ascending");
        }
        else if (descending) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}