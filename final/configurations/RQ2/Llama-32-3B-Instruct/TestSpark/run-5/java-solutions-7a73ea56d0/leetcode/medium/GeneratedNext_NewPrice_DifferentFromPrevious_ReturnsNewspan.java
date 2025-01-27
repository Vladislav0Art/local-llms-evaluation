package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedNext_NewPrice_DifferentFromPrevious_ReturnsNewspan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NewPrice_DifferentFromPrevious_ReturnsNewspan() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(15);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 20, 15};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

}