package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMultipleElementsArrayTest {

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = new int[]{1, 1, 1, 2, 1, 4, 6};

        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(prices.length, spans.length);
        assertEquals(Arrays.toString(expectedSpans), Arrays.toString(spans));
    }

}