package DataStructure;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();
        names.add("Rudi");
        names.add("Tomi");
        names.add("Adam");
        names.add(1, "Budi"); // Menambahkan "Budi" di indeks 1


        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name at index " + i + ": " + names.get(i));
        }
    }
}
