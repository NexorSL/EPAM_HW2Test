public class FindSum {
    public static int[] indecesOfTwoNumbers(int[] nums, int target) {
        if(nums.length == 0 && nums == null) return null;
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return null;
    }
}
