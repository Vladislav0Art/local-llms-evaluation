package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class GeneratedTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [next][smallInput]

    Test() {
        int price = 3;
        int expectedCount = 1;
        assertEquals(expectedCount, stockSpan.next(price));
    }

    @Test
    public void [next][mediumInput]

    Test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        for (int i : prices) {
            stockSpan.next(i);
        }
        int expectedCount = 2;
        assertEquals(expectedCount, stockSpan.next(5));
    }

    @Test
    public void [next][largeInput]

    Test() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(101));
        }
        stockSpan.list = list;
        for (int price : list) {
            stockSpan.next(price);
        }
        int expectedCount = 1;
        assertEquals(expectedCount, stockSpan.next(list.get(0)));
    }

    @Test
    public void [calculateSpans][smallInput]

    Test() {
        int[] prices = {1, 2};
        int[] spans = stockSpan.calculateSpans(prices);
        assertTrue(spans[0] > 0 && spans[0] < prices.length);
        assertTrue(spans[1] > 0 && spans[1] < prices.length);
    }

    @Test
    public void [calculateSpans][mediumInput]

    Test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] spans = stockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertTrue(spans[i] >= 0 && spans[i] <= i + 1);
        }
    }

    @Test
    public void [calculateSpans][largeInput]

    Test() {
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