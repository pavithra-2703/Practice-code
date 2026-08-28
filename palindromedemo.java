public class palindromedemo {
    public static void main(String[] args) {
        String s = "aba";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (new StringBuilder(sub).reverse().toString().equals(sub)) {
                    System.out.println("Palindrome: " + sub);
                    count++;
                } else {
                    System.out.println("Substring: " + sub);
                }
            }
        }
        System.out.println("Total Palindromes: " + count);

    }
}

