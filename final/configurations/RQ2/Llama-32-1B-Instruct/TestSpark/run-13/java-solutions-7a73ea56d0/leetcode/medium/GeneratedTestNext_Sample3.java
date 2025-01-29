package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_Sample3 {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNext_Sample3() {
        int[] prices = {100, 120};
        int result = instance.next(110);
        Mockito.verify(instance).next(Mockito.anyInt());
        Mockito.verify(mockStockSpan).calculateSpans(Mockito.anyArray());

        // TODO: Check if the calculated span is correct.
    }

}