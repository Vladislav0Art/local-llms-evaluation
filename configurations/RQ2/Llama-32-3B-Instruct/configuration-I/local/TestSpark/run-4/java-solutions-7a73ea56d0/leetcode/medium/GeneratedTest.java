package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Mock
    private StockSpan stockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSpans_EmptyArray_ReturnsEmptyArray() {
        setup();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertNotNull(result);
        assertTrue(result.length == 0);
    }

    @Test
    public void testNext_ExistingPrice_ReturnsNextValue() {
        when(stockSpan.next(anyInt())).thenReturn(11);
        assertEquals(11, onlineStockSpan.next(10));
    }

    @Test
    public void testNext_NegativePrice_ReturnsNegativeValue() {
        when(stockSpan.next(anyInt())).thenReturn(-6);
        assertEquals(-6, onlineStockSpan.next(-5));
    }

    @Test
    public void testCalculateSpans_SingleElementArray_ReturnsCorrectSpans() {
        setup();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertTrue(result.length == 1);
        assertEquals(1, result[0]);
    }

    @Test
    public void testCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        setup();
        when(stockSpan.calculateSpans(anyInt[][])).thenReturn(new int[][]{{2}, {1}, {0}});
        int[] prices = {10, 7, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertTrue(result.length == 3);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void testCalculateSpans_DuplicateElementsArray_ReturnsCorrectSpans() {
        setup();
        when(stockSpan.calculateSpans(anyInt[][])).thenReturn(new int[][]{{1}, {2}, {0}});
        int[] prices = {10, 10, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertTrue(result.length == 3);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(0, result[2]);
    }

}