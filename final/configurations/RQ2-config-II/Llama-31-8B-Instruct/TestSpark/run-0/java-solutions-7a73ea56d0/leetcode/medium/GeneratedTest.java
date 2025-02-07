package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_EmptyStack_Returns1() {
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void next_PriceHigherThanCurrent_Returns1() {
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(20);
        assertEquals(1, result);
    }

    @Test
    public void next_PriceLowerThanCurrent_Returns2() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(15);
        assertEquals(2, result);
    }

    @Test
    public void next_PriceEqualCurrent_Returns1() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsArrayWith1() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_IncreasingPrices_ReturnsCorrectSpans() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}