package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DifferentPrices_MockNextMethod {

    @Test
    public void next_DifferentPrices_MockNextMethod() {
        OnlineStockSpan solution = new OnlineStockSpan();
        when(solution.next(anyInt())).thenReturn(5);
        int[] prices = {3, 2, 6, 5};
        for (int i = 0; i < prices.length; i++) {
            if (i == 0)
                assertEquals(1, solution.next(prices[i]));
            else
                assertEquals(solution.next(prices[i - 1]) + 1, solution.next(prices[i]));
        }
    }

}