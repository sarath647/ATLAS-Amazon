public class Task010 {
    public static void main(String[] args) {
        int a = 25;
        int b = 25;
        int c = 25;

        if (a > b && a > c) {
            System.out.println("a is the greatest");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest");
        } else if (c > a && c > b) {
            System.out.println("c is the greatest");
        } else {
            System.out.println("Two or more numbers are equal and greatest");
        }
    }
}