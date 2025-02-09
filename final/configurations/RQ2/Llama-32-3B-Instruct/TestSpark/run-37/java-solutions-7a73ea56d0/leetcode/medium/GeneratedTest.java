package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_0_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.next(0);
        assertThat(result.length, is(1));
        assertThat(result[0], is(1));
    }

    @Test
    public void next_NegativeNumber_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.next(-1);
        assertThat(result.length, is(1));
        assertThat(result[0], is(1));
    }

    @Test
    public void next_Zero_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.next(0);
        assertThat(result.length, is(1));
        assertThat(result[0], is(1));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {};
        Object result = solution.calculateSpans(prices);
        assert result == null;
    }

    @Test
    public void calculateSpans_SingleElementArray_Returns2DArrayWithCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[][] result = solution.calculateSpans(prices);
        assertThat(result.length, is(1));
        assertThat(result[0].length, is(2));
        assertThat(result[0][0], is(1));
        assertThat(result[0][1], is(1));
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectResult() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60, 95};
        int[][] result = solution.calculateSpans(prices);
        assertThat(result.length, is(6));
        for (int i = 0; i < result.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < prices.length; j++) {
                if (!stack.isEmpty() && prices[j] >= result[i][0]) {
                    int span = j - ((Stack) solution.calculateSpans(prices)).pop();
                    result[i][1] += span;
                }
                stack.push(j);
            }
        }
    }

    @Test
    public void calculateSpans_EmptyArray_MocksStackPush() {
        OnlineStockSpan solution = new OnlineStockSpan();
        List<Integer> mockStackPushCount = new ArrayList<>();
        Stack<Object> mockStack = Mockito.mock(Stack.class);
        ((Stack) solution.calculateSpans(prices)).pushMock(mockStack, 3);
    }

}