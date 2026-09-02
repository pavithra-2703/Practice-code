import java.util.*;

public class SearchEngineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dictionary of valid words
        String[] dict = {"apple","application","appetite","banana","band","bandwidth"};

        System.out.print("Enter your search word: ");
        String query = sc.nextLine().toLowerCase();

        boolean found = false;
        for (String w : dict) {
            if (w.equals(query)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Word is correct: " + query);
        } else {
            System.out.println("Word might be misspelled. Suggestions:");
            for (String w : dict) {
                if (w.startsWith(query) || editDistance(query, w) <= 2) {
                    System.out.println(w);
                }
            }
        }

        sc.close();
    }

    // Simple edit distance (Levenshtein)
    private static int editDistance(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i==0) dp[i][j] = j;
                else if (j==0) dp[i][j] = i;
                else if (a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],
                            Math.min(dp[i-1][j], dp[i][j-1]));
            }
        }
        return dp[m][n];
    }
}
