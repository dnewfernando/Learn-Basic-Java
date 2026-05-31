public class Conditional {
    public static void main(String[] args) {
        int nilaiUjian = 95;

        if (nilaiUjian >= 90) {
            System.out.println("Nilai A");
        } else if (nilaiUjian >= 80) {
            System.out.println("Nilai B");
        } else if (nilaiUjian >= 70) {
            System.out.println("Nilai C");
        } else if (nilaiUjian >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }

        int bulanSekarang = 5;
        switch (bulanSekarang) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;
            default:
                System.out.println("Bulan tidak valid");
        }
    }
}