package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCalculateSpans_MultipleElementsInput_LowerPrices_HappyPathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsInput_LowerPrices_HappyPathTest() {
        int[] prices = {100, 50, 40, 30, 20, 10};
        Stack<Integer> indexStack = new Stack<>();
        int[] expected = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < prices.length; i++) {
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= prices[i])
                indexStack.pop();
            if (indexStack.isEmpty())
                expected[i] = i + 1;
            else
                expected[i] = i - indexStack.peek();
            indexStack.push(i);
        }
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}