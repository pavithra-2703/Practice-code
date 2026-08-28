public class StringMethod {
    public static void main(String[] args) {

        String a = "Hello java";
        System.out.println(a.length());
        System.out.println(a.charAt(9));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(0,5));
        String b="Hello_Java";
        if(a.equals(b)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(b.indexOf('j'));
        System.out.println(a+" programming");
        System.out.println(b.replace("Hello","halla"));
        System.out.println(a.replace("Hello","welcome"));
    }
}
