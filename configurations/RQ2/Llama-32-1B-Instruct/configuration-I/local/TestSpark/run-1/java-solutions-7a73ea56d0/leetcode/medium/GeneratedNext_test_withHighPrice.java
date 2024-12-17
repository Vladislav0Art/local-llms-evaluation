package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test_withHighPrice {

    @Test
    public void next_test_withHighPrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 10;
        int[] prices = {2, 6};
        int expected = 4;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}