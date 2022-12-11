package Practise;
/*HashMap is nothing but key value pairs*/
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> employee = new HashMap<>();
        employee.put("Vijay", 8074);
        employee.put("Tilak", 8919);
        employee.put("Siva", 7993);
        employee.put("Yeswanth", 6303);
        employee.put("Nagasai", 9154);
        /*Displaying all the employees*/
        System.out.println(employee);
        /*Retrieving the employee id using the name ie., key
        * So we get the value of the key
        * Similarly we can retrieve the same using the value of the key*/
        System.out.println(employee.get("Nagasai"));
        employee.put("Anvesh",1010);
        /*Trying different methods in hashmap*/
        employee.putIfAbsent("Manohar",9551);
        System.out.println(employee.containsValue(8919));
        System.out.println(employee.remove("Anvesh"));
        System.out.println(employee);
        System.out.println(employee.isEmpty());
        System.out.println(employee.replace("Manohar", 9551, 5391));
        System.out.println(employee);



    }
}
