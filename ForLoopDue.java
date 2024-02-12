public class ForLoopDue {
    public static void main(String[] args) {

        printRevertedNumbers(7,3);

    };
    public static void printRevertedNumbers(int index, int maxValue) {

        for(int i=0;i<maxValue;i++)
            System.out.println(index--);

    };
}
