public class SwitchUno {
    public static void main(String[] args) {

        System.out.println(dayOfWeek(4));

    }

    public static String dayOfWeek(int day){

        String result;

        switch (day) {

            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wenesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Error!";
                break;
        }

        return result;

    }
}
