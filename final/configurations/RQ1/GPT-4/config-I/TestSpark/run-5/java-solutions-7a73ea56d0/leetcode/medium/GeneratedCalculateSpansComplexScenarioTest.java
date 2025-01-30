package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansComplexScenarioTest {

    @Test
    public void calculateSpansComplexScenarioTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 60, 70, 60, 75, 85};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 2, 1, 4, 6}, result);
    }

}