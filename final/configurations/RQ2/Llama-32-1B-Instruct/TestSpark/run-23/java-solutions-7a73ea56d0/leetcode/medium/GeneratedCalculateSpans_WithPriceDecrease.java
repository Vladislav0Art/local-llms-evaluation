package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedCalculateSpans_WithPriceDecrease {

    @Mock
    private Stack<Integer> priceStack;

    @Test
    public void calculateSpans_WithPriceDecrease() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 900, 800};
        int result1 = instance.calculateSpans(prices1);
        verify(priceStack, times(0)).peek();

        int result2 = instance.calculateSpans(new int[]{700, 500, 400});
        verify(priceStack).peek().intValue();
    }

}