class Calculation1{
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

public class Task031 extends Calculation1 {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String[] args) {
        int a = 20, b = 11;
        Task031 task031 = new Task031();
        task031.addition(a, b);
        task031.Subtraction(a, b);
        task031.multiplication(a, b);
    }
}
