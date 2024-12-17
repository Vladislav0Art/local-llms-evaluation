package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class Generated[calculateSpans][smallInput]

Test {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [calculateSpans][smallInput]Test() {
        int[] prices = {1, 2};
        int[] spans = stockSpan.calculateSpans(prices);
        assertTrue(spans[0] > 0 && spans[0] < prices.length);
        assertTrue(spans[1] > 0 && spans[1] < prices.length);
    }

}