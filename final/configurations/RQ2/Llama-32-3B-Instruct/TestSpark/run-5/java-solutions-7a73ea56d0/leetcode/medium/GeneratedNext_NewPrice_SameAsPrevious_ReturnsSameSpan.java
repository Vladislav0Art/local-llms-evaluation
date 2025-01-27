package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedNext_NewPrice_SameAsPrevious_ReturnsSameSpan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NewPrice_SameAsPrevious_ReturnsSameSpan() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 10};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

}