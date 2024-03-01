public class Problem2 {
    public static int countDigits(int n) {
        if (n < 10) {
            return 1; // Base case: when n is a single digit
        } else {
            return 1 + countDigits(n / 10); // Recursive case: add 1 and recurse with n/10
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Number of digits in " + number + ": " + countDigits(number));
    }
}

