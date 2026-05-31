package DataStructure;

public class TreeSet {
    public static void main(String[] args) {
        java.util.Set<String> namaBuah = new java.util.TreeSet<>();
        namaBuah.add("Apel");
        namaBuah.add("Pisang");
        namaBuah.add("Jeruk");
        namaBuah.add("Apel"); // Duplikat, tidak akan ditambahkan

        System.out.println("Nama buah dalam TreeSet:");
        for (String buah : namaBuah) {
            System.out.println(buah);
        }
    }
}
