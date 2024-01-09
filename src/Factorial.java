public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        System.out.println(factorial(5));

    }

    public static int factorial(int n) { // with recursion
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }


}
