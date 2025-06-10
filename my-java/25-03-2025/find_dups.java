public class find_dups {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 3};
        int[] temp = new int[array.length];
        int size = 0;
        System.out.print("The duplicated elements are :");
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (array[i] == temp[j]) {
                    found = true;
                    System.out.print(" "+array[i]);
                }
            }
            if (!found) {
                temp[size] = array[i];
                size=size+1;
            }
        }
    }
}