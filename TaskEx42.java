public class TaskEx42 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}