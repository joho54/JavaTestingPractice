import java.util.Scanner;

public class Main {
    static int MAX_N = 1000;
    static int[] dp = new int[MAX_N];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[1] = 2;
        dp[2] = 7;
        for(int i = 3; i <= n; i++){
            int tmp = 0;
            for(int j = 1; j < i-2; j++){
                tmp += 2*dp[j];
            }
            dp[i] = (2*dp[i-1]+3*dp[i-2]+tmp)%1000000007;
        }

        System.out.println(dp[n]);
    }
}