package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    private int[] list = new int[0];

    public void next(int price) {
        list = Arrays.copyOf(list, list.length + 1);
        if (list[0] == price) {
            list[list.length - 1]++;
        } else {
            for (int i = 0; i < list.length; i++) {
                if (list[i] <= price) {
                    list = Arrays.copyOfRange(list, i, list.length + 1);
                    break;
                }
            }
            list[list.length - 1] += 1;
        }
    }

    public int[] calculateSpans(int[] prices) {
        for (int price : prices) {
            next(price);
        }
        return Arrays.copyOf(list, list.length);
    }
}

public class GeneratedTest {

    public static class GeneratedTest {

        @Test
        public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {};
            int[] result = solution.calculateSpans(prices);
            assertTrue(result.length == 0);
        }

        @Test
        public void calculateSpans_SingleElementArray_ReturnsCorrectArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {1};
            int[] result = solution.calculateSpans(prices);
            assertEquals(1, result[0]);
        }

        @Test
        public void calculateSpans_MultipleElementsArray_ReturnsCorrectArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {3, 2, 4, 1};
            int[] result = solution.calculateSpans(prices);
            assertEquals(5, result[0]);
        }

        @Test
        public void calculateSpans_DifferentPricesArray_ReturnsCorrectArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {4, 5, 3, 7};
            int[] result = solution.calculateSpans(prices);
            assertEquals(2, result[0]);
        }

        @Test
        public void calculateSpans_ReverseOrderArray_ReturnsCorrectArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {1, 4, 3, 5, 2};
            int[] result = solution.calculateSpans(prices);
            assertEquals(2, result[0]);
        }

        @Test
        public void calculateSpans_DuplicatePricesArray_ReturnsCorrectArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {1, 1, 1};
            int[] result = solution.calculateSpans(prices);
            assertEquals(2, result[0]);
        }

        @Test
        public void calculateSpans_DifferentPricesArray_ReturnsCorrectArray() {
            OnlineStockSpan solution = new OnlineStockSpan();
            int[] prices = {1, 4, 3, 5, 2};
            int[] result = solution.calculateSpans(prices);
            assertEquals(2, result[0]);
        }

    }