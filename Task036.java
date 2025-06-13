public class Task036 {

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        Task036 obj = new Task036();
        obj.display("Alice", 30);  // matches String, int
        obj.display(25, "Bob");    // matches int, String
    }
}
