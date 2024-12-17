package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test_withNullPrice {

    @Test
    public void next_test_withNullPrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = null;
        int[] prices = {2, 6};
        int expected = 0;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}