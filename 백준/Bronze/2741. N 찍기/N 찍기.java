import java.util.*;

public class Main{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int count = 1;
        for (int i = 0; i < a; i++){
            System.out.println(count);
            count++;
        }
    }
}