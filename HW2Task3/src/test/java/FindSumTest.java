import org.junit.Test;

import static org.junit.Assert.*;

public class FindSumTest {
    @Test
    public void testFindSum(){
        int[] array = {2,7,11,15};
        int[] result = FindSum.indecesOfTwoNumbers(array, 26);
        assertArrayEquals(result, new int[]{2,3});
    }
}
