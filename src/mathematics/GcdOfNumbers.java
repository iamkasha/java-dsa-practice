package mathematics;

/*
 * GCD using Euclidean algorithm (recursive).
 * Time complexity: O(log(min(a,b)))
 */
class GcdOfNumbers {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 98, b = 56;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
