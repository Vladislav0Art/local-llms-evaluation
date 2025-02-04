package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedTest {

    public class OnlineStockSpan {
        private List<Integer> list;

        public OnlineStockSpan() {
            this.list = new ArrayList<>();
        }

        public int next(int price) {
            list.add(price);
            int count = 0;
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i) > price)
                    break;
                count++;
            }
            return count;
        }

        public int[] calculateSpans(int[] prices) {

            int[] spans = new int[prices.length];
            spans[0] = 1; // Span of first element is always 1

            Stack<Integer> indexStack = new Stack<>();

            // Push the index of first element
            indexStack.push(0);

            for (int i = 1; i < prices.length; i++) {
                while (!indexStack.isEmpty()
                        && prices[indexStack.peek()] <= prices[i])
                    indexStack.pop();

                // If index stack is empty, the price at index 'i'
                // is greater than all previous values
                if (indexStack.isEmpty())
                    spans[i] = i + 1;
                else
                    spans[i] = i - indexStack.peek();

                indexStack.push(i);
            }

            return spans;
        }
    }

    @Test
    public void testNextSingleValue() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        assertEquals(1, onlineStockSpan.list.get(0));
    }

    @Test
    public void testNextIncreasingValues() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        assertEquals(3, onlineStockSpan.list.get(2));
    }

    @Test
    public void testNextDecreasingValues() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(8);
        onlineStockSpan.next(6);
        assertEquals(3, onlineStockSpan.list.get(2));
    }

    @Test
    public void testCalculateSpansSingleValue() {
        int[] prices = {10};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testCalculateSpansIncreasingValues() {
        int[] prices = {10, 20, 30};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testCalculateSpansDecreasingValues() {
        int[] prices = {10, 8, 6};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testCalculateSpansEmptyArray() {
        int[] prices = {};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{0}, onlineStockSpan.calculateSpans(prices));
    }

}