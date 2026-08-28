public class StringTest {
    public static void main(String[] args) {
        String a =new String("Siya");
        String b =new String("Siya");

        if (a == b) {
            System.out.println("True (==)");
        } else {
            System.out.println("False (==)");
        }

        if (a.equals(b)) {
            System.out.println("True (.equals)");
        } else {
            System.out.println("False (.equals)");
        }
    }
}
