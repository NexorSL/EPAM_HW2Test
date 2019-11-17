public class CheckDuplicates {
    public static boolean checkDuplicates(int[] array) {
        if (array.length == 0 || array == null) return false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
