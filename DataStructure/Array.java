package DataStructure;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;


        String[] names = {"Rudi", "Tomi", "Adam"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);

        for(int i=0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }
    }
}
