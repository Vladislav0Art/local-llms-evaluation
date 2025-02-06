package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArray_ThrowsException {

    @Test
    public void calculateSpans_EmptyArray_ThrowsException() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertThrows(NullPointerException.class, () -> stockSpan.calculateSpans(new int[]{}));
    }

}

public class StockPriceProviderMock {
    private List<Integer> prices;

    public StockPriceProviderMock(int... prices) {
        this.prices = Arrays.asList(prices);
    }

    public Integer getPrice() {
        return prices.isEmpty() ? null : prices.remove(0);
    }

}