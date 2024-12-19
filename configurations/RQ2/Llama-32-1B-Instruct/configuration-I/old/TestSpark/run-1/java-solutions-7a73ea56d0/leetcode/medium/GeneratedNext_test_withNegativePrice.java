package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test_withNegativePrice {

    @Test
    public void next_test_withNegativePrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = -1;
        int[] prices = {2, 6};
        int expected = 0;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}