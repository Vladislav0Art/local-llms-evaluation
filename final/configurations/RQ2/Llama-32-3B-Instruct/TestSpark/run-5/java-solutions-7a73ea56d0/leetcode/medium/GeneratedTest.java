package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NoHistory_Returns1() {
        int result = onlineStockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void next_NewPrice_DifferentFromPrevious_ReturnsNewspan() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(15);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 20, 15};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

    @Test
    public void next_NewPrice_SameAsPrevious_ReturnsSameSpan() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 10};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

    @Test
    public void next_MultipleIncreases_DifferentRates_ReturnsCorrectRates() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 20, 30};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

    @Test
    public void next_MultipleDecreases_DifferentRates_ReturnsCorrectRates() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(8);
        onlineStockSpan.next(6);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 8, 6};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

    @Test
    public void next_MultipleIncreases_DifferentRates_NoDecreases_ReturnsCorrectRates() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 20, 30};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

    @Test
    public void next_MultipleDecreases_DifferentRates_NoIncreases_ReturnsCorrectRates() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(8);
        onlineStockSpan.next(6);

        Mockito.verifyNoMoreInteractions(onlineStockSpan);

        int[] lastPrices = new int[]{10, 8, 6};
        assertEquals(lastPrices, onlineStockSpan.calculateSpans(lastPrices));
    }

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

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int result[] = onlineStockSpan.calculateSpans(new int[]{});
        assert Arrays.equals(result, new int[]{});
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectArray() {
        int result[] = onlineStockSpan.calculateSpans(new int[]{10});
        assertEquals(new int[]{10}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectArray() {
        int result[] = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 8, 6});
        assert Arrays.equals(result, new int[]{10, 11, 12, 3, 4});
    }

}