import java.util.*;

public class Main{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++){
            b *= i;
        }
        System.out.println(b);
    }
}