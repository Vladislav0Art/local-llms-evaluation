package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedNext_PriceIsEqualToAllPreviousPrices_ReturnsCorrectCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_PriceIsEqualToAllPreviousPrices_ReturnsCorrectCount() {
        // given
        int price = 90;
        int[] previousPrices = {100};
        int expectedCount = 1;

        stockSpan.next(100);

        // when
        int actualCount = stockSpan.next(price);

        // then
        assertEquals(expectedCount, actualCount);
    }

}