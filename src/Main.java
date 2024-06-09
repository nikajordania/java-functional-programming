public class Main {
    public static void main(String[] args) {
        // Example usage: passing a lambda expression as a function parameter
        int result1 = Calculator.operate(5, 3, (a, b) -> a + b);
        System.out.println("Result1: " + result1); // Output: 8

        // Example usage: passing an anonymous class as a function parameter
        int result2 = Calculator.operate(5, 3, new IntBinaryOperator() {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        });
        System.out.println("Result2: " + result2); // Output: 15
    }
}