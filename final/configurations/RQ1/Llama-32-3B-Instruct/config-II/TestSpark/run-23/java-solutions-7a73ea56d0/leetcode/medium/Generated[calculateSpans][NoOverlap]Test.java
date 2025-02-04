package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class Generated[calculateSpans][NoOverlap]

Test {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void [calculateSpans][NoOverlap]Test() {
        int[] prices = {100, 80, 70, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 5, 9}, result);
    }

}