public class Main {
    public static void displayDigitsReverse(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.println(n % 10);
            displayDigitsReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Digits of " + number + " in reverse order:");
        displayDigitsReverse(number);
    }
}