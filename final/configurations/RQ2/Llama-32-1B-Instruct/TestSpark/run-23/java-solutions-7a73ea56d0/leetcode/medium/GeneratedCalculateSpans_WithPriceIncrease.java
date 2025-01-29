package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedCalculateSpans_WithPriceIncrease {

    @Mock
    private Stack<Integer> priceStack;

    @Test
    public void calculateSpans_WithPriceIncrease() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 1100, 1200};
        int result1 = instance.calculateSpans(prices1);
        verify(priceStack, times(0)).peek();

        int result2 = instance.calculateSpans(new int[]{1300, 1500, 1600});
        verify(priceStack).peek().intValue();
    }

}