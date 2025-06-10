import java.util.Arrays;
public class rem_dups {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 3};
        int[] temp = new int[array.length];
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (array[i] == temp[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[size] = array[i];
                size=size+1;
            }
        }
        int[] result = Arrays.copyOf(temp, size);
        System.out.println(Arrays.toString(result));
    }
}