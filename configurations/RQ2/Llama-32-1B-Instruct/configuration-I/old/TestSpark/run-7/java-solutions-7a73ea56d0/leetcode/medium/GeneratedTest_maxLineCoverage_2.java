package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTest_maxLineCoverage_2 {

    @Test
    public void test_maxLineCoverage_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(50)).thenReturn(20);
        when(onlineStockSpan.next(100)).thenReturn(40);
        int[] prices = {50, 200, 300, 400};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
    }

}