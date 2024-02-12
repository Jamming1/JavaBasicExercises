public class LunghezzaTesto {
    public static void main(String[] args) {

        String greatings = "Hello!";

        System.out.println("String lenght is : " + size(greatings));
    };

    public static int size(String greatings){

        int textSize = greatings.length();
        return textSize;
    }
}
