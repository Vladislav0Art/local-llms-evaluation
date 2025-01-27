package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class GeneratedNext_DifferentDaysPrices_ReturnsCorrectSpan {

    @Test
    public void next_DifferentDaysPrices_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertEquals(1 + (onlineStackSpan.stack.size() == 0 ? 0 : stack.get(stack.size() - 1).span), result);
        }
    }

}