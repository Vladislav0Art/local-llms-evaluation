package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyInput_ReturnsEmptyArray {

    public int next(int price) {
        return 1; // Stubbed implementation
    }

    public int[] calculateSpans(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = 1;
            } else {
                result[i] = i - stack.peek() + 1;
            }
            stack.push(i);
        }
        return result;
    }

}

package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class OnlineStockSpanTest {

    @Mock
    private Stack<Integer> mockStack;

    public int[] calculateSpans(int[] prices) {
        return new OnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        int[] result = calculateSpans(new int[0]);
        assert Arrays.equals(result, new int[0]);
    }

}