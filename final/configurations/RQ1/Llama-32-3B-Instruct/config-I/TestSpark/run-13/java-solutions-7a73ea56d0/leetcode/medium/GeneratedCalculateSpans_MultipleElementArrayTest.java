package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementArrayTest {

    public OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementArrayTest() {
        int[] prices = {7, 6, 4, 3, 10};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{5, 2, 1, 0, 4}, result);
    }

}