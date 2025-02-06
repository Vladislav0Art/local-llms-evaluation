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
public class GeneratedNext_ThrowsExceptionWhenStackNotEmpty {

    @Mock
    private Stack<Integer> stack;

    public int[] calculateSpans(int[] prices) {
        return new OnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void next_ThrowsExceptionWhenStackNotEmpty() {
        when(stack.isEmpty()).thenReturn(false);
        when(stack.pop()).thenReturn(10);

        assertThrows(NullPointerException.class, () -> new OnlineStockSpan().next(5));
    }

}