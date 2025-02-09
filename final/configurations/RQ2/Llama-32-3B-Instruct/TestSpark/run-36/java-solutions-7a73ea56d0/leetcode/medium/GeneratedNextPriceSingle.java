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
public class GeneratedNextPriceSingle {

    @Mock
    private Stack<Integer> stockSpanStack;

    public StockSpanCalculator calculator = new StockSpanCalculator(stockSpanStack);

    @Test
    public void nextPriceSingle() {
        when(calculator.next(anyInt())).thenReturn(1);
    }

}