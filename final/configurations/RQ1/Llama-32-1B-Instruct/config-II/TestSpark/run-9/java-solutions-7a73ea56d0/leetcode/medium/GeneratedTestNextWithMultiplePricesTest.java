package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class GeneratedTestNextWithMultiplePricesTest {

    @Test
    public void testNextWithMultiplePricesTest() {
        int[] prices = {1, 7, 6, 9};
        OnlineStockSpan.OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        assertEquals(3, onlineStockSpan.list.size());
    }

}