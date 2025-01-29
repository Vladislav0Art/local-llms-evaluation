package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    public static void main(String[] args) {
    }

    @Test
    public void test_maxLineCoverage_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(4, result.length);
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (!stack.isEmpty() && prices[i] >= stack.peek()) {
                stack.remove(stack.size() - 1);
            }
            stack.add(prices[i]);
            OnlineStockSpan.MaxLineCoverage maxLineCoverage = onlineStockSpan.next(prices[i]);
            int spanLength = 0;
            while (maxLineCoverage != null) {
                if (spanLength > prices.length) break;
                spanLength++;
                maxLineCoverage = maxLineCoverage.next(maxLineCoverage.price);
            }
            verify(stack).remove((int) 0);
        }
    }

    @Test
    public void test_maxLineCoverage_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 1, 3};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void test_maxLineCoverage_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {2, 4, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void test_maxLineCoverage_4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 10, 3};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(2, result.length);
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (!stack.isEmpty() && prices[i] >= stack.peek()) {
                stack.remove(stack.size() - 1);
            }
            stack.add(prices[i]);
            OnlineStockSpan.MaxLineCoverage maxLineCoverage = onlineStockSpan.next(prices[i]);
            int spanLength = 0;
            while (maxLineCoverage != null) {
                if (spanLength > prices.length) break;
                spanLength++;
                maxLineCoverage = maxLineCoverage.next(maxLineCoverage.price);
            }
            verify(stack).remove((int) 0);
        }
    }

    @Test
    public void test_maxLineCoverage_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void test_maxLineCoverage_6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(3, result.length);
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (!stack.isEmpty() && prices[i] >= stack.peek()) {
                stack.remove(stack.size() - 1);
            }
            stack.add(prices[i]);
            OnlineStockSpan.MaxLineCoverage maxLineCoverage = onlineStockSpan.next(prices[i]);
            int spanLength = 0;
            while (maxLineCoverage != null) {
                if (spanLength > prices.length) break;
                spanLength++;
                maxLineCoverage = maxLineCoverage.next(maxLineCoverage.price);
            }
            verify(stack).remove((int) 0);
        }
    }

    @Test
    public void test_maxLineCoverage_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result.length);
    }

}