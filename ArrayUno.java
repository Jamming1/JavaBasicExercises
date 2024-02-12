public class ArrayUno {
    public static void main(String[] args) {
        printSum();
    }

    private static void printSum() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("la somma è: " + sum);
    }
}
