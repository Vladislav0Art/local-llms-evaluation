package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test_withZeroPrice {

    @Test
    public void next_test_withZeroPrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 0;
        int[] prices = {};
        int expected = 1;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}