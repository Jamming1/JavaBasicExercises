public class WhileLoop {
    public static void main (String[] args){

        System.out.println(sumOfValues(6));
    }
    public static int sumOfValues(int limit){

        int i = 0;

        while(i<=limit){
            i+= limit;
        }
        return i;
    }
}
