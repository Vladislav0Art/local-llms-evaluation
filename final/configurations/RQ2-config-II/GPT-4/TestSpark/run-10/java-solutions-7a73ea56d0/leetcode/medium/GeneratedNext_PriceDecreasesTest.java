package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_PriceDecreasesTest {

    @Test
    public void next_PriceDecreasesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 40};
        int[] expectedSpans = new int[]{1, 1, 1, 1};

        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedSpans[i], stockSpan.next(prices[i]));
        }
    }

}