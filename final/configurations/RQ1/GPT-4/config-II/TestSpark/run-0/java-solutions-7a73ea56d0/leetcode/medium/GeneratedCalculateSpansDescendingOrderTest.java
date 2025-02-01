package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDescendingOrderTest {

    @Test
    public void calculateSpansDescendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {250, 200, 150, 100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue("Descending elements all have span of 1",
                result[0] == 1 && result[1] == 1 &&
                        result[2] == 1 && result[3] == 1);
    }

}