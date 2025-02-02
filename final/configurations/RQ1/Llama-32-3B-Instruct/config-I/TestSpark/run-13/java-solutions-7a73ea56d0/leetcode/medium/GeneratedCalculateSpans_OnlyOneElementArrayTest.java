package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedCalculateSpans_OnlyOneElementArrayTest {

    public OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_OnlyOneElementArrayTest() {
        int[] prices = {7};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}