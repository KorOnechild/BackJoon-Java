import java.util.Scanner;

public class SugarProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int n = N / 5;

        if(N == 4 || N == 7){
            System.out.println(-1);
        } else if (N < 10 && N % 3 == 0) {
            System.out.println(N / 3);
        } else if (N % 5 == 0) {
            System.out.println(n);
        } else if( N == (5 * n) + 1 || N == (5 * n) + 3){
            System.out.println(n + 1);
        } else if (N == (5 * n) + 2 || N == (5 * n) + 4) {
            System.out.println(n + 2);
        }
    }
}
