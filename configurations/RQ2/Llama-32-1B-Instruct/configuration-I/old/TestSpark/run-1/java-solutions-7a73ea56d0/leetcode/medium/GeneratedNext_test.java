package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNext_test {

    @Test
    public void next_test() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 1;
        int[] prices = {2, 6};
        int expected = 3;
        int actual = stock.next(price);
        assertEquals(expected, actual);
    }

}