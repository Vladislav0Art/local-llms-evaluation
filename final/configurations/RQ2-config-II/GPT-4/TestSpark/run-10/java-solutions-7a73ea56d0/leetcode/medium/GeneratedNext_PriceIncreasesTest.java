package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_PriceIncreasesTest {

    @Test
    public void next_PriceIncreasesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 150, 200, 250};
        int[] expectedSpans = new int[]{1, 2, 3, 4};

        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedSpans[i], stockSpan.next(prices[i]));
        }
    }

}