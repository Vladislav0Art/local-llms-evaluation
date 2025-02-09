package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextPriceZero {

    @Mock
    private Stack<Integer> stockSpanStack;

    public StockSpanCalculator calculator = new StockSpanCalculator(stockSpanStack);

    @Test
    public void nextPriceZero() {
        when(calculator.next(anyInt())).thenReturn(0);
        int[] prices = {2};
        for (int price : prices) {
            calculator.next(price);
        }
        int[] result = new int[prices.length];
        Arrays.setAll(result, (i, e) -> i + 1);
        assertEquals(Arrays.toString(result), Arrays.toString(calculator.calculateSpans(prices)));
    }

}