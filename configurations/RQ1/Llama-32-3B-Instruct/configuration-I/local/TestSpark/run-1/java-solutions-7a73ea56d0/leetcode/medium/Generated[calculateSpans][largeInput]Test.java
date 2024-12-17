package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class Generated[calculateSpans][largeInput]

Test {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [calculateSpans][largeInput]Test() {
        int[] prices = new int[10000];
        Random random = new Random();
        for (int i = 0; i < prices.length; i++) {
            prices[i] = random.nextInt(101);
        }
        int[] spans = stockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertTrue(spans[i] >= 0 && spans[i] <= prices.length - 1);
        }
    }

}