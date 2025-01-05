public class TaskSheet120 {
    public static void main(String[] args) {
        int result = CumulativeSum(4, 5, 10);
        System.out.println("Total sum: " + result);
    }
    public static int CumulativeSum(int... numbers) {
        int totalSum = 0;
        for (int num : numbers) {
            int cumulativeSum = CumulativeSum(num);
            System.out.println("Sum of " + num + " = " + cumulativeSum);
            totalSum += cumulativeSum;
        }
        return totalSum;
    }
    private static int CumulativeSum(int n) {
        return n * (n + 1) / 2;
    }
}
