package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTest_maxLineCoverage_3 {

    @Test
    public void test_maxLineCoverage_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(50)).thenReturn(20);
        when(onlineStockSpan.next(200)).thenReturn(60);
        int[] prices = {100, 150, 300, 400};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}