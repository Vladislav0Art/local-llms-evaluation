package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_Method_CalculatesCorrectSpanForNoPrices {

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
    public void calculateSpans_Method_CalculatesCorrectSpanForNoPrices() {
        when(stack.peek()).thenReturn(0);
        int[] result = calculateSpans(new int[0]);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

}