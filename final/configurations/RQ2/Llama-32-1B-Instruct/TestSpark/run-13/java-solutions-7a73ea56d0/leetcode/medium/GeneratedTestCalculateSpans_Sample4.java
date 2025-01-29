package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCalculateSpans_Sample4 {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSpans_Sample4() {
        int[] prices = {7, 6, 4, 3, 2};
        OnlineStockSpan.Span[] result = instance.calculateSpans(prices);
        Mockito.verify(mockStockSpan).calculateSpans(Mockito.anyArray());

        // TODO: Check if the calculated spans are correct.
    }

}