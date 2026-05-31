import java.util.Scanner;

public class PR1 {
    public static void main(String[] args) {
        Scanner angka1 = new Scanner(System.in);
        Scanner opr = new Scanner(System.in);  
        Scanner angka2 = new Scanner(System.in); 

        while (true) {
            System.out.print("Masukkan angka pertama: ");
                double number1 = angka1.nextDouble();
            System.out.print("Masukkan operator (+, -, *, /): ");
                String operator = opr.nextLine();
            System.out.print("Masukkan angka kedua: ");
                double number2 = angka2.nextDouble();
            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
                String continueInput = opr.nextLine();

            if (continueInput.equalsIgnoreCase("n")) {
                System.out.println("\nTerima kasih telah menggunakan kalkulator sederhana!");
                angka1.close();
                opr.close();
                angka2.close();

                break;
            }

            switch (operator) {
                case "+":
                    System.out.println("Hasil: " + (number1 + number2));
                    break;
                case "-":
                    System.out.println("Hasil: " + (number1 - number2));
                    break;
                case "*":
                    System.out.println("Hasil: " + (number1 * number2));
                    break;
                case "/":
                    if (number2 != 0) {
                        System.out.println("Hasil: " + (number1 / number2));
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid. Silakan coba lagi.");
            }
        }
    }
}
