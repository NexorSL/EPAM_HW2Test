import org.junit.Test;

import static org.junit.Assert.*;

public class CheckDuplicatesTest {

    @Test
    public void testCheckDuplicates(){
        int[] array = {1,2,3,4,1};
        boolean result = CheckDuplicates.checkDuplicates(array);
        assertEquals(result, true);
    }
}
