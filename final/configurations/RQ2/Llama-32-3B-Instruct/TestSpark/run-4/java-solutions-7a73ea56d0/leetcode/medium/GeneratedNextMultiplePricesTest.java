package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedNextMultiplePricesTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextMultiplePricesTest() {
        int[] prices = {100, 80, 75, 90};
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                assertEquals(1, onlineStockSpan.next(prices[i]));
            } else {
                assertEquals(i + 1, onlineStockSpan.next(prices[i]));
            }
        }
    }

}