package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void nextPrice_SingleElement_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void nextPrice_MultipleElements_CalculateSpansCorrectly() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        stockSpan.next(75);
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

    @Test
    public void nextPrice_DuplicateValues_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(100);
        stockSpan.next(80);
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

    @Test
    public void nextPrice_LowestValue_CalculateSpansCorrectly() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        stockSpan.next(60);
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

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