package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCalculateSpans {

    public int[] calculateSpans(int[] prices) {
        Stack<Integer> indexStack = new Stack<>();
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= prices[i]) {
                indexStack.pop();
            }
            if (indexStack.isEmpty()) {
                result[i] = 1;
            } else {
                result[i] = i - indexStack.peek();
            }
            indexStack.push(i);
        }
        return result;
    }

    public int next(int price) {
        Stack<Integer> indexStack = new Stack<>();
        while (!indexStack.isEmpty() && prices[indexStack.peek()] <= price) {
            indexStack.pop();
        }
        if (indexStack.isEmpty()) {
            result[0] = 1;
        } else {
            result[0] = 1 + next(price);
        }
        return result[0];
    }

    public int[] prices;

    @Test
    public void testCalculateSpans() {
        this.prices = new int[]{100, 80, 60, 70, 60, 90, 100};
        int[] result = calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2, 3, 5, 6, 7}, result);
    }

}