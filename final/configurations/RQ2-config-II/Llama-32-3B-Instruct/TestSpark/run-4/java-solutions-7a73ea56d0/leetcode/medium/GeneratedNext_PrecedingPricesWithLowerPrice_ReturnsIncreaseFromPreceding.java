package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedNext_PrecedingPricesWithLowerPrice_ReturnsIncreaseFromPreceding {

    @Test
    public void next_PrecedingPricesWithLowerPrice_ReturnsIncreaseFromPreceding() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result1 = onlineStockSpan.next(10);
        int result2 = onlineStockSpan.next(7);
        assertEquals(result1 + 1, result2);
    }

}