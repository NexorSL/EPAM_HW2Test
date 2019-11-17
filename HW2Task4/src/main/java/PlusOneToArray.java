public class PlusOneToArray {

    public static int[] plusOne(int[] array){
        if(array.length == 0 || array == null) return null;
        boolean isAdded = false;
        int i = 1;
        while (!isAdded){
            try {
                if(array[array.length-i] == 9){
                    array[array.length-i] = 0;
                    i++;
                } else {
                    array[array.length-i]++;
                    isAdded = true;
                }
            } catch (Exception e){
                System.out.println(e);
                isAdded = true;
            }
        }
        return array;
    }
}
