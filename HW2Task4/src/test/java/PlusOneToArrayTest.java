import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneToArrayTest {

    @Test
    public void testPlusOne(){
        int[] array = {4,3,2,1};
        int[] result = PlusOneToArray.plusOne(array);
        assertArrayEquals(result, new int[]{4,3,2,2});

    }
}
