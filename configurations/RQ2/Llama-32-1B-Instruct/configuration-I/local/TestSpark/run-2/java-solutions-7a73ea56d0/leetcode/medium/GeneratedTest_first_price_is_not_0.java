package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest_first_price_is_not_0 {

    @Test
    public void test_first_price_is_not_0() {
        int[] prices = {1, 2, 3, 4, 0};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(1)).thenReturn(null);
        while (prices.length > 0) {
            stockSpan = stockSpan.next(prices);
            if (stockSpan == null) break;
            prices = stockSpan.getPrices();
        }
        assert prices[0] != 0; // Check if the first price is not 0
    }

}