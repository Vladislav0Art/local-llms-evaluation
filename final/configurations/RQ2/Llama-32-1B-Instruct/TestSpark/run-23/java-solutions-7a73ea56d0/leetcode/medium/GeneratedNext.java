package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedNext {

    @Mock
    private Stack<Integer> priceStack;

    @Test
    public void next() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int result1 = instance.next(100);
        verify(priceStack, times(0)).peek();

        int result2 = instance.next(99);
        verify(priceStack).peek().intValue();

        int result3 = instance.next(98);
        verify(priceStack).peek().intValue();

        int result4 = instance.next(97);
        verify(priceStack).peek().intValue();
    }

}