 public class Problem3 {
    public static int arraySum(int[] arr, int n) {
        if (n <= 0) {
            return 0; // Base case: return 0 when there are no elements in the array
        } else {
            return arr[n - 1] + arraySum(arr, n - 1); // Recursive case: add current element to sum and recurse with n-1
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Sum of elements in the array: " + arraySum(arr, n));
    }
}

