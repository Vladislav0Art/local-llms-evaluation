package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNext_SingleElementArray_ReturnsNonZeroValue {

    @Test
    public void next_SingleElementArray_ReturnsNonZeroValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        assertTrue(solution.next(prices).next().getValue() > 0);
    }

}