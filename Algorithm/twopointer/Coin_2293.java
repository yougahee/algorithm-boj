package Algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin_2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[10001];
        dp[0] = 1;
        for(int i=0; i<n; i++) {
            for(int j = arr[i]; j<=k; j++)
                if(j - arr[i] >= 0)
                    dp[j] += dp[j - arr[i]];
        }

        System.out.println(dp[k]);
    }
}
