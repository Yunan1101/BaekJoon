import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;
        String def = "LoveisKoreaUniversity";
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(def + " ");
        }
    }
}