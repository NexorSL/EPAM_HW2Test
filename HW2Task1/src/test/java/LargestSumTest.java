import org.junit.Test;

import static org.junit.Assert.*;

public class LargestSumTest {

    @Test
    public void testLargestSum(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = LargestSum.largestSumArraySub(nums);
        assertEquals(result, 6);
    }
}
