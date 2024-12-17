package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSpans_test {

    @Test
    public void calculateSpans_test() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {2, 6};
        int[][] result = {{0, 1}, {3, 4}};
        int expected = 7;
        int actual = stock.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}