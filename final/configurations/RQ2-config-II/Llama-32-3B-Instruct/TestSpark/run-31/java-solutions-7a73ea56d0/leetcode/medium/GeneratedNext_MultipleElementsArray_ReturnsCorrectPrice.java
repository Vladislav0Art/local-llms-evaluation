package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNext_MultipleElementsArray_ReturnsCorrectPrice {

    @Test
    public void next_MultipleElementsArray_ReturnsCorrectPrice() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 95};
        assertTrue(solution.next(prices).next().getValue() == prices[0]);
        assertTrue(solution.next(prices).next().getValue() == prices[1]);
        assertTrue(solution.next(prices).next().getValue() == prices[2]);
        assertTrue(solution.next(prices).next().getValue() == prices[3]);
        assertTrue(solution.next(prices).next().getValue() == prices[4]);
    }

}