package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maxLineCoverage_SamePriceMultipleTimesWithStack {

    @Test
    public void test_maxLineCoverage_SamePriceMultipleTimesWithStack() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 7;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = instance.calculateSpans(new int[]{price});
        assertEquals(2, result.size());
    }

}