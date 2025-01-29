package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_Sample1 {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNext_Sample1() {
        int[] prices = {7, 6, 4, 3, 2};
        int result = instance.next(7);
        Mockito.verify(instance).next(Mockito.anyInt());
        Mockito.verify(mockStockSpan).calculateSpans(Mockito.anyArray());

        // TODO: Check if the calculated span is correct.
    }

}