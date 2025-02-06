package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedNext_HigherValuesReturnCorrectPriceAndSpan {

    @Test
    public void next_HigherValuesReturnCorrectPriceAndSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {70, 100};
        for (int price : prices) {
            int result = solution.next(price);
            assertTrue(result == price + 1);
        }
    }

}