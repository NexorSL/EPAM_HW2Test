import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementsTest {

    @Test
    public void testRemoveElements(){
        int[] array = {0,1,2,2,3,0,4,2};
        int result = RemoveElements.remove(array,2);
        assertEquals(result, 5);
    }
}
