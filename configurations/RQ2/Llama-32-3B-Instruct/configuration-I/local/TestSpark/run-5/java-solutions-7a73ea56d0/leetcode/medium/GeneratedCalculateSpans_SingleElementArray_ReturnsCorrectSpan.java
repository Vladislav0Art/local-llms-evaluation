package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
    @Mock
    private int[] prices;

    public void setUp() {
        when(prices[0]).thenReturn(100);
        when(prices[1]).thenReturn(200);
        when(prices[2]).thenReturn(300);
    }

    // Test next method with valid price

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{100});
        assertEquals(new int[]{1}, result);
    }

}