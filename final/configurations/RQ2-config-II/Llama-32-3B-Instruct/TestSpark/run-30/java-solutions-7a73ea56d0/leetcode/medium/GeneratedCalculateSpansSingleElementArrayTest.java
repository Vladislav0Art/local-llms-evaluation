package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpansSingleElementArrayTest {

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] expected = {1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}