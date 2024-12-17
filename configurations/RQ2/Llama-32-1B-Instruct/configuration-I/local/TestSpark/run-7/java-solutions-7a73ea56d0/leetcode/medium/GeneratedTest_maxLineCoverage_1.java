package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTest_maxLineCoverage_1 {

    @Test
    public void test_maxLineCoverage_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(100)).thenReturn(20);
        when(onlineStockSpan.next(50)).thenReturn(30);
        int[] prices = {100, 200, 300, 400};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(4, result.length);
        assertEquals(3, result[0]);
        assertEquals(2, result[1]);
        assertEquals(6, result[2]);
        assertEquals(15, result[3]);
    }

}