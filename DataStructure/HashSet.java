package DataStructure;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> namaBuah = new java.util.HashSet<>();
        namaBuah.add("Apel");
        namaBuah.add("Pisang");
        namaBuah.add("Jeruk");
        namaBuah.add("Apel"); // Duplikat, tidak akan ditambahkan

        System.out.println("Nama buah dalam HashSet:");
        for (String buah : namaBuah) {
            System.out.println(buah);
        }
    }
}
