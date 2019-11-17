public class RemoveElements {

    public static int remove(int[] array, int value) {
        if(array.length == 0 || array == null) return -1;
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                array[newLength] = array[i];
                newLength++;
            }
        }
        return newLength;
    }
}
