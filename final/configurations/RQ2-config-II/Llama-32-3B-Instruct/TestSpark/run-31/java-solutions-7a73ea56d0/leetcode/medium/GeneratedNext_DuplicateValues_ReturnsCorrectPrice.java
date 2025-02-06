package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNext_DuplicateValues_ReturnsCorrectPrice {

    @Test
    public void next_DuplicateValues_ReturnsCorrectPrice() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 95};
        assertTrue(solution.next(prices).next().getValue() == prices[0]);
        assertTrue(solution.next(prices).next().getValue() == prices[0]);
    }

}