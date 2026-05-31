package DataStructure;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> umurOrang = new java.util.HashMap<>();
        umurOrang.put("Alice", 30);
        umurOrang.put("Bob", 25);
        umurOrang.put("Charlie", 35);
        umurOrang.put("Alice", 31); // Update umur Alice
        System.out.println("Umur Alice: " + umurOrang.get("Alice"));

        for (Map.Entry<String, Integer> entry : umurOrang.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
