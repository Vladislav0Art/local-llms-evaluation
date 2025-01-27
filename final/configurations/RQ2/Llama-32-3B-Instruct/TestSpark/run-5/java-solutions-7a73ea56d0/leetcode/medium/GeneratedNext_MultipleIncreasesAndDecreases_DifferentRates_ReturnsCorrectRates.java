package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedNext_MultipleIncreasesAndDecreases_DifferentRates_ReturnsCorrectRates {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_MultipleIncreasesAndDecreases_DifferentRates_ReturnsCorrectRates() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        onlineStockSpan.next(8);
        onlineStockSpan.next(6);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 20, 30, 8, 6};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

}