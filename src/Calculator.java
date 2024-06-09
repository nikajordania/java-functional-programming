// Define a class with a method that takes a function as parameter
class Calculator {
    static int operate(int x, int y, IntBinaryOperator op) {
        return op.apply(x, y);
    }
}
