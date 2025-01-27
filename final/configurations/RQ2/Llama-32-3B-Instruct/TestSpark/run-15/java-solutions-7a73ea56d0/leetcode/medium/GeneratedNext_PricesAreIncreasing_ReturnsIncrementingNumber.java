package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(java.lang.reflect.Modifier.restrictIf(Matcher.isNotNullClass(OnlineStockSpan.class)
        public class GeneratedNext_PricesAreIncreasing_ReturnsIncrementingNumber{

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
    public void next_PricesAreIncreasing_ReturnsIncrementingNumber() {
        int[] prices = {10, 20, 30};
        for (int i = 0; i < prices.length; i++) {
            int lastPrice = new OnlineStockSpan().stack.isEmpty() ? -100 : new OnlineStockSpan().stack.pop();
            assertEquals i +1, new OnlineStockSpan().next(prices[i]);
            if (i > 0) {
                assert new OnlineStockSpan().next(prices[i]) > new OnlineStockSpan().next(prices[i - 1]);
            }
        }
    }

}