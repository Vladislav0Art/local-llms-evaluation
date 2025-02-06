package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_Method_CalculatesCorrectSpanForAllPrices {

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
    public void calculateSpans_Method_CalculatesCorrectSpanForAllPrices() {
        int[] prices = {10, 15, 20};
        int[] expectedSpans = {1, 2, 3};
        when(stack.peek()).thenReturn(0);

        for (int i = 0; i < prices.length; i++) {
            calculateSpans(new int[]{prices[i]});
            assertEquals(expectedSpans[i], stack.pop());
        }
    }

}