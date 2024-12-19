package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest_next_price_is_not_null {

    @Test
    public void test_next_price_is_not_null() {
        int[] prices = {1, 2, 3, 4, 5};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(6)).thenReturn(null);
        while (prices.length > 0) {
            stockSpan = stockSpan.next(prices);
            if (stockSpan == null) break;
            prices = stockSpan.getPrices();
        }
        assert prices.length() == 5; // Check if the last price is indeed 5
    }

}