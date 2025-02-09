package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_MocksStackPush {

    @Test
    public void calculateSpans_EmptyArray_MocksStackPush() {
        OnlineStockSpan solution = new OnlineStockSpan();
        List<Integer> mockStackPushCount = new ArrayList<>();
        Stack<Object> mockStack = Mockito.mock(Stack.class);
        ((Stack) solution.calculateSpans(prices)).pushMock(mockStack, 3);
    }

}