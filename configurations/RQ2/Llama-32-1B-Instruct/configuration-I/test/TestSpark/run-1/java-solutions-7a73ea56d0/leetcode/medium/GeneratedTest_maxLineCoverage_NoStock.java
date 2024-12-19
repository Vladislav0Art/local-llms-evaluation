package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_maxLineCoverage_NoStock {

    @Test
    public void test_maxLineCoverage_NoStock() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1};
        try {
            stock.calculateSpans(prices);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

}