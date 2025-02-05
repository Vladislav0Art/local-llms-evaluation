package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_SingleItemArrayTest {

    @Test
    public void calculateSpans_SingleItemArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] expectedSpans = new int[]{1};

        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}