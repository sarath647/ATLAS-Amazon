public class Task034 {

    // Method with 2 parameters
    void add(int x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Method with 3 parameters (overloaded)
    void add(int x, int y, int z) {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        Task034 obj = new Task034();
        obj.add(10, 20, 30);
        obj.add(50, 100);
    }
}
