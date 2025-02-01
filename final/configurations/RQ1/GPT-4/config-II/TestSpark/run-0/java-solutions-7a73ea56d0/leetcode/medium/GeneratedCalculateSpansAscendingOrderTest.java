package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAscendingOrderTest {

    @Test
    public void calculateSpansAscendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 150, 200, 250};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue("Ascending elements have ascending span values",
                result[0] == 1 && result[1] == 2 &&
                        result[2] == 3 && result[3] == 4);
    }

}