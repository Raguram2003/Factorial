import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(findfactorial(N));

    }
    public static int findfactorial(int n)
    {
        if (n <= 1) {
            return 1;
        }
        return findfactorial(n - 1)*n;

    }
}
