package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedCalculateSpans {

    @Mock
    private Stack<Integer> priceStack;

    @Test
    public void calculateSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {100, 200, 300};
        int[] expected1 = {1, 2, 3};
        int result1 = instance.calculateSpans(prices1);
        verify(priceStack, times(0)).peek();

        int result2 = instance.calculateSpans(new int[]{150, 500, 250});
        verify(priceStack).peek().intValue();
    }

}