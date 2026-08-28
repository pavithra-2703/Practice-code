public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");

        a.append(" Java");
        System.out.println(a);

        a.insert(5," programming");
        System.out.println(a);

        a.delete(6,17);
        System.out.println(a);

        System.out.println(a.reverse());

        System.out.println(a.length());

    }
}
