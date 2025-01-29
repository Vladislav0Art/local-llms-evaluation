package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maxLineCoverage {

    @Test
    public void test_maxLineCoverage() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        when(instance.next(2)).thenReturn(0);
        when(instance.next(7)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(4, result.size());
    }

}