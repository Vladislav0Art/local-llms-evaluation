package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_PriceDecreasesTest {

    @Test
    public void calculateSpans_PriceDecreasesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 40};
        int[] expectedSpans = new int[]{1, 1, 1, 1};

        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}