import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee ("Ivan", 45);
        System.out.println(employee1.hashCode());
        Employee employee2 = new Employee ("Nikolai", 27);
        System.out.println(employee2.hashCode());

        HashMap<String, String> hashMap1 = new HashMap<>(6);

        String oldValue;
        oldValue = hashMap1.put("+79057951555", "Valeriia");
        oldValue = hashMap1.put("+79030189892", "Liudmila");
        oldValue = hashMap1.put("+79057951554", "Nikolai");
        oldValue = hashMap1.put("+32777890045", "Nikolas");

        System.out.println(hashMap1);




    }
}