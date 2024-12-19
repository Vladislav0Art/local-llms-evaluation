package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_1() {
        OnlineStockSpan test = new OnlineStockSpan();
        int result = test.next(10);
        assertEquals(2, result);
    }

    @Test
    public void next_maximizing_line_coverage() {
        OnlineStockSpan test = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        prices.add(3);
        prices.add(2);
        prices.add(5);
        prices.add(0);
        prices.add(5);
        prices.add(7);
        prices.add(4);
        prices.add(6);

        int[] result1 = test.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2}, result1);

        int[] result2 = test.calculateSpans(prices);
        assertEquals(new int[]{3, 2, 5}, result2);

        int[] result3 = test.calculateSpans(prices);
        assertEquals(new int[]{3, 2, 5, 4, 6}, result3);

        int[] result4 = test.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 2, 5, 5}, result4);

        List<Integer> prices2 = new ArrayList<>();
        prices2.add(10);
        prices2.add(20);
        prices2.add(30);
        prices2.add(40);
        prices2.add(50);

        int[] result5 = test.calculateSpans(prices2);
        assertEquals(new int[]{1, 2}, result5);
    }

    @Test
    public void next_0() {
        OnlineStockSpan test = new OnlineStockSpan();
        int result = test.next(0);
        assertEquals(-1, result);

        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(20);
        prices.add(30);
        prices.add(40);
        prices.add(50);

        int[] result2 = test.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result2);
    }

}