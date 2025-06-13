class Employees {
    private int pwd;
    protected int salary;
    public int empid;


    Employees() {
        System.out.println("Employee constructor called");
    }
}

class Task037 extends Employees {

    Task037() {
        super(); // Call parent constructor
        //pwd = 123;
        salary = 50000;      // ✅ protected: accessible in child class
        empid = 10001;       // ✅ public: accessible everywhere
    }

    public static void main(String[] args) {
        Task037 obj = new Task037();
        System.out.println("Salary: " + obj.salary);
        System.out.println("Emp ID: " + obj.empid);
    }
}
