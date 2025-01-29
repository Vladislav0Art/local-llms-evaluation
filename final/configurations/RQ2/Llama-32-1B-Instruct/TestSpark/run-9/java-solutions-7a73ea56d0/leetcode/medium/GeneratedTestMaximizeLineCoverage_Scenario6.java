package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestMaximizeLineCoverage_Scenario6 {

    @Test
    public void testMaximizeLineCoverage_Scenario6() {
        int[] prices = {3};
        OnlineStockSpan stock = new OnlineStockSpan();

        when(prices).anyOf(Arrays.asList(4)).thenReturn(true);
        when(stock.next(4)).thenReturn(0);

        int expectedSpans = calculateSpans(prices);

        assertEquals(expectedSpans, stock.next(3));
    }

    public static int[] calculateSpans(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int price : prices) {
            while (!stack.isEmpty() && stack.peek() < price) {
                stack.pop();
            }
            if (prices.length == 0 || stack.isEmpty()) {
                break;
            } else if (!stack.isEmpty() && stack.peek() <= price) {
                stack.push(price);
            }
        }

        int[] result = new int[prices.length];
        for (int i = prices.length - 1; i >= 0; --i) {
            result[i] = stack.pop();
        }

        return result;
    }

}