import java.util.*;
public class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList
        List a1 = new ArrayList();
        a1.add("Sarath");
        a1.add("Ravi");
        a1.add("maya");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
        List l1 = new LinkedList();
        l1.add("Sarath");
        l1.add("Ravi");
        l1.add("maya");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Sarath");
        s1.add("Ravi");
        s1.add("maya");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Sarath", "8");
        m1.put("Ravi", "31");
        m1.put("maya", "12");
        m1.put("Vimal", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
