package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextMethod_ReturnsCorrectValue {

    @Mock
    private Stack<Integer> stack;

    public int next(int price) {
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        // implementation
        return new int[prices.length];
    }

    @Test
    public void nextMethod_ReturnsCorrectValue() {
        when(stack.peek()).thenReturn(0);
        assertEquals(next(10), 1);
    }

}