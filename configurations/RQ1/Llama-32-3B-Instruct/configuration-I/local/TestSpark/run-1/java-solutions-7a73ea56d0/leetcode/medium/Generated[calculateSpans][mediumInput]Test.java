package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class Generated[calculateSpans][mediumInput]

Test {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [calculateSpans][mediumInput]Test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] spans = stockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertTrue(spans[i] >= 0 && spans[i] <= i + 1);
        }
    }

}