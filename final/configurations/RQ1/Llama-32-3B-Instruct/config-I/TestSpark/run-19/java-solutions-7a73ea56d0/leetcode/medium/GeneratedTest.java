package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedTest {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next() {
        OnlineStockSpan instance = new OnlineStockSpan();
        instance.list.add(5);
        assertEquals(1, instance.next(3));
    }

    @Test
    public void next_SamePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        instance.list.add(10);
        instance.list.add(10);
        assertEquals(1, instance.next(10));
    }

    @Test
    public void next_LowerPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        instance.list.add(5);
        instance.list.add(3);
        assertEquals(2, instance.next(3));
    }

    @Test
    public void calculateSpans_SingleElement() {
        int[] prices = {7};
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElements() {
        int[] prices = {30, 103, 75, 30, 100, 130};
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 1, 2, 1, 3}, result);
    }

    @Test
    public void calculateSpans_EmptyInput() {
        int[] prices = {};
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, result);
    }
}

public class OnlineStockSpan {

    List<Integer> list;

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