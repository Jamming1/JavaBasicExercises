public class OperatoriLogici {
    public static void main (String[] args){

        int lowerBuond = 1;
        int upperBound = 20;
        int value = 16;

        System.out.println("lower bound :" + lowerBuond);
        System.out.println("upper bound :" + upperBound);
        System.out.println("comparation value :" + value);
        System.out.println("This number is included :" + isIncluded(lowerBuond, upperBound, value));

    }

    public static boolean isIncluded(int lowerBuond , int upperBound, int value){

        return (value >= lowerBuond) && (value <= upperBound);

    }
}
