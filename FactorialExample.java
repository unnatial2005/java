public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // The number to find the factorial of
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

