package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_MultipleTimes_ReturnsCorrectCount {

    @Test
    public void nextPrice_MultipleTimes_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70};
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        assertEquals(4, onlineStockSpan.list.size());
    }

}