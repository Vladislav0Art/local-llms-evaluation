package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTest_maxLineCoverage_5 {

    @Test
    public void test_maxLineCoverage_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(50)).thenReturn(20);
        int[] prices = {1000, 2000, 3000, 4000};
        int[] result = onlineStockSpan.calculateSpans(prices);
    }

}