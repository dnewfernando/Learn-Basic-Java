package DataStructure;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> listBuah = new java.util.LinkedList<>();
        listBuah.add("Apel");
        listBuah.add("Pisang");
        listBuah.add("Jeruk");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println("Buah di indeks " + i + ": " + listBuah.get(i));
        }

        listBuah.remove("Pisang");
        listBuah.remove(1);
        System.out.println("Setelah penghapusan:");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println("Buah di indeks " + i + ": " + listBuah.get(i));
        }
    }
}
