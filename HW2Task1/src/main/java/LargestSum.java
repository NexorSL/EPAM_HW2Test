public class LargestSum {
    public static int largestSumArraySub(int[] nums) {
        if(nums.length == 0 || nums == null) return -1;
        int largestSum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > largestSum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }
}
