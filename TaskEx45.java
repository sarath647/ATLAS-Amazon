public class TaskEx45 {

    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]);  // Valid
            System.out.println(myNumbers[3]);  // Invalid - will throw ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("I'm from finally block.");
        }

    }
}
