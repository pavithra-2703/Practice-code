public class ModularExponential {

    public static long powerMod(long a, long b, long m) {
        long result = 1;
        a = a % m;

        while (b > 0) {

            if ((b & 1) == 1) {
                result = (result * a) % m;
            }

            a = (a * a) % m;

            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = 2;
        long b = 10;
        long m = 10000;

        long result = powerMod(a, b, m);
        System.out.println(result);
    }
}