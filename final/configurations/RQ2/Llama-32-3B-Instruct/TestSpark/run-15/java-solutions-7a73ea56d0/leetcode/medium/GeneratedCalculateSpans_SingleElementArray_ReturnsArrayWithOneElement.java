package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(java.lang.reflect.Modifier.restrictIf(Matcher.isNotNullClass(OnlineStockSpan.class)
        public class GeneratedCalculateSpans_SingleElementArray_ReturnsArrayWithOneElement{

        private Stack<Integer>stack = new Stack<>();

        public int next(int price) {
    if (stack.isEmpty() || stack.peek() != price) {
        stack.push(price);
    }
    return stack.size();
}

public int[] calculateSpans(int[] prices) {
    int[] result = new int[prices.length];
    for (int i = 0; i < prices.length; i++) {
        if (stack.isEmpty()) {
            result[i] = 1;
        } else if (stack.peek() != prices[i]) {
            result[i] = stack.size() + 1;
            stack.push(prices[i]);
        } else {
            result[i] = result[i - 1];
            stack.pop();
            stack.push(prices[i]);
        }
    }
    return result;
}
}

        package leetcode.medium;

import org.junit.Test;
import static org.junit.Assert .*;
        import java.util.Arrays;

@RunWith(java.lang.reflect.Modifier.restrictIf(Matcher.isNotNullClass(OnlineStockSpan.class)))
public class OnlineStockSpanTest {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsArrayWithOneElement() {
        int[] prices = {10};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertArrayEquals new int[]{1}, result;
    }

}