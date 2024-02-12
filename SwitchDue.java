public class SwitchDue {
    public static void main(String[] args) {

        System.out.println(aritmOperator('*'));

    }

    public static String aritmOperator(char operator){

        String result;

        switch(operator){

            case '+' :

                result ="addition";

                break;

            case '-' :

                result = "subtraction";

                break;

            case '*' :

                result = "moltiplication";

                break;

            case '/' :

                result ="division";

                break;

            default:

                result = "!!!!Attention error!!!!!";

                break;
        }
        return result;
    }

}
