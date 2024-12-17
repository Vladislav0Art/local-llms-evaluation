package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test_withLowPrice {

    @Test
    public void next_test_withLowPrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 2;
        int[] prices = {3, 6};
        int expected = 1;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}