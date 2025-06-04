public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void printResults(int x, int y) {
        System.out.println("Adding: " + x + " + " + y + " = " + add(x, y));
        System.out.println("Multiplying: " + x + " * " + y + " = " + multiply(x, y));
    }
}
