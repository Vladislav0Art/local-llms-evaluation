package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenNoPricesGiven_thenInitialZeroSpan {

    @Test
    public void givenNoPricesGiven_thenInitialZeroSpan() {
        when(stack.peek()).thenReturn(null);
        int[] result = stack.calculateSpans(new int[]{0});
        assertEquals(1, result[0]);
    }

}