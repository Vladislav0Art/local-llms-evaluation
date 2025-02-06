package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    // [calculateSpans]Test

    @Test
    public void testCalculateSpans_ReturnsEmptyArray_WhenInputIsEmpty() {
        List<Integer> result = onlineStockSpan.calculateSpans(new int[0]);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCalculateSpans_ReturnsCorrectSpansForIncreasingPrices() {
        when(onlineStockSpan.next(anyInt())).thenReturn(2);
        List<Integer> prices = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            prices.add(i);
        }
        int[] result = onlineStockSpan.calculateSpans(prices.toArray(new Integer[0]));
        assertEquals(1, result.length);
    }

    @Test
    public void testCalculateSpans_ReturnsCorrectSpansForDecreasingPrices() {
        when(onlineStockSpan.next(anyInt())).thenReturn(10);
        List<Integer> prices = new ArrayList<>();
        for (int i = 11; i >= 1; i--) {
            prices.add(i);
        }
        int[] result = onlineStockSpan.calculateSpans(prices.toArray(new Integer[0]));
        assertEquals(9, result.length);
    }

    @Test
    public void testNext_ReturnsCorrectPrice() {
        when(onlineStockSpan.next(anyInt())).thenReturn(5);
        int result = onlineStockSpan.next(3);
        assertEquals(5, result);
    }

}