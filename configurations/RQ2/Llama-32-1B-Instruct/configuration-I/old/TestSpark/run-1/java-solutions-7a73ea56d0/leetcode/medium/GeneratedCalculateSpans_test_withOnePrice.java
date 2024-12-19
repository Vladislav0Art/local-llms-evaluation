package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSpans_test_withOnePrice {

    @Test
    public void calculateSpans_test_withOnePrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 10;
        int[][] result = {{0, 1}, {2, 3}};
        int expected = 4;
        int actual = stock.calculateSpans(new int[]{price});
        assertEquals(expected, actual);
    }

}