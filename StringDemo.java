import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int characters = 0;
        int vowels = 0;

        String lower = sentence.toLowerCase();

        for(int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            // Count characters excluding spaces
            if(ch != ' ') {
                characters++;
            }

            // Count vowels
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Characters: " + characters);
        System.out.println("Vowels: " + vowels);
        System.out.println(sentence.substring(0,11));

        sc.close();
    }
}
