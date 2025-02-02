package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedNext_PriceIsGreaterOrEqualToAllPreviousPrices_ReturnsCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_PriceIsGreaterOrEqualToAllPreviousPrices_ReturnsCount() {
        // given
        int price = 100;
        int expectedCount = 1;

        // when
        int actualCount = stockSpan.next(price);

        // then
        assertEquals(expectedCount, actualCount);
    }

}