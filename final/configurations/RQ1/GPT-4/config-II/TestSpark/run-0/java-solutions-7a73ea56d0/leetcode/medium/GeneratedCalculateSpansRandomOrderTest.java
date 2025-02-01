package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansRandomOrderTest {

    @Test
    public void calculateSpansRandomOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {200, 100, 150, 100, 200};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue("Random elements have span according to their position",
                result[0] == 1 && result[1] == 1 &&
                        result[2] == 2 && result[3] == 1 && result[4] == 5);
    }

}