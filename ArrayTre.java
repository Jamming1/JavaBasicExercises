import java.util.Arrays;

public class ArrayTre {
    public static void main(String[] args) {

        int [] values = new int[]{1,1,2,2,3,4,5,5};
        System.out.println("l'array senza duplicati corrisponde a: " + Arrays.toString(duplicateRemover(values)));

    }

    public static int[] duplicateRemover(int [] array){

        int [] list = new int[array.length];

        int j = 0;

        for(int i = 0; i < array.length-1;i++){

            if(array[i] != array[i+1]){
                list [j++] = array[j];
            } else {
                list [j++] = -1;
            }

        }
        list [j++] = array.length -1;
        return list;
    }
}
