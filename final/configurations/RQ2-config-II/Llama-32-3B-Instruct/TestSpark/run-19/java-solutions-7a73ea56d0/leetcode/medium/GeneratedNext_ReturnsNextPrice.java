package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_ReturnsNextPrice {

    @Mock
    private Stack<Integer> stack;

    public int[] calculateSpans(int[] prices) {
        return new OnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void next_ReturnsNextPrice() {
        when(stack.isEmpty()).thenReturn(true);
        when(stack.push(10)).thenReturn(false);
        when(stack.peek()).thenReturn(0);

        int result = new OnlineStockSpan().next(5);
        assertEquals(6, result);
    }

}