package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test_withNoPrices {

    @Test
    public void next_test_withNoPrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 10;
        int[] prices = {};
        int expected = 1;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}