import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = maxNumber(n, m);
        System.out.println(answer);
    }

    public static int maxNumber(int a, int b) {
        if (b == 0) return a;

        return maxNumber(b, a % b);
    }
}