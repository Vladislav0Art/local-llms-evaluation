package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_DuplicatePrices_ReturnsSameAsLast {

    @Test
    public void next_DuplicatePrices_ReturnsSameAsLast() {
        OnlineStockSpan s = new OnlineStockSpan();
        int result = s.next(100);
        int result2 = s.next(100);
        assertEquals(result2, 1);
    }

}