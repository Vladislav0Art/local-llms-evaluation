package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansOneElement_ReturnsCorrectSpan {

    public List<Integer> list = new ArrayList<>();

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
        spans[0] = 1;

        Stack<Integer> indexStack = new Stack<>();

        // Push the index of first element
        indexStack.push(0);

        for (int i = 1; i < prices.length; i++) {
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= prices[i])
                indexStack.pop();

            if (indexStack.isEmpty())
                spans[i] = i + 1;
            else
                spans[i] = i - indexStack.peek();

            indexStack.push(i);
        }

        return spans;
    }
}

public class OnlineStockSpanTest {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("OnlineStockSpanTest");
    }

    @Test
    public void calculateSpansOneElement_ReturnsCorrectSpan() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}