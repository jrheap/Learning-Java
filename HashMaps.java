import java.util.HashMap;
import java.util.HashMaps;

public class HashMaps {
    public static void main(String[] args) {
        


    // Setting up the componet?
    HashMap<String, Integer> payroll = new HashMap<>();


    payroll.put("Jason", 100000);
    payroll.put("John", 50000);

    payroll.get("Jason");
    payroll.get("John");

    System.out.println(payroll.getOrDefault("David", -10));

    payroll.put("David", 1234);
    payroll.forEach((first, salary) -> {
        System.out.println(String.format("%s's salary is %d", first, salary));
    });





    }
}