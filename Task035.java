public class Task035 {

    // Method with char parameters
    void add(char x, char y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Method with int parameters (overloaded)
    void add(int x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Task035 obj = new Task035();
        obj.add('d', 'a');     // calls char version
        obj.add(100, 100);     // calls int version
    }
}