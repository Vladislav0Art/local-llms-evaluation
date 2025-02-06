package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            int result = solution.next(price);
            assertEquals(1, result); // initial value
        }
    }

}