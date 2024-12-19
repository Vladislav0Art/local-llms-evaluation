package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest_pricesAreNotNegative {

    @Test
    public void test_pricesAreNotNegative() {
        int[] prices = {1, 2, 3, 4};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(-5)).thenReturn(1);
        while (prices.length > 0) {
            stockSpan = stockSpan.next(prices);
            if (stockSpan == null) break;
            prices = stockSpan.getPrices();
        }
        assert prices[0] != -5; // Check if the first price is not negative
    }

    public void next(int[] prices, int index, int price) {
        for (; index < prices.length; index++) {
            prices[index] = price;
        }
    }

    public void getPrices(OnlineStockSpan stockSpan) {
        while (stockSpan != null) {
            System.out.println(stockSpan.getPrices());
            stockSpan = stockSpan.next();
        }
    }

}