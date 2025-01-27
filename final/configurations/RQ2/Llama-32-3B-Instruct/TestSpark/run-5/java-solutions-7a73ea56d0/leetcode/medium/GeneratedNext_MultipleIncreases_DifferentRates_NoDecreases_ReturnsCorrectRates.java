package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedNext_MultipleIncreases_DifferentRates_NoDecreases_ReturnsCorrectRates {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_MultipleIncreases_DifferentRates_NoDecreases_ReturnsCorrectRates() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 20, 30};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

}