package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCalculateSpans_WithMockedNext_SingleElementArray_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_WithMockedNext_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(Mockito.anyInt())).thenReturn(1);
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    public static class OnlineStockSpan {
        private int[] heights;

        public int[] calculateSpans(int[] heights) {
            this.heights = new int[heights.length + 1];
            System.arraycopy(heights, 0, this.heights, 1, heights.length);
            int[] result = new int[heights.length];
            result[0] = heights[0];

            for (int i = 1; i < heights.length; i++) {
                if (heights[i - 1] >= heights[i]) {
                    result[i] = result[i - 1];
                } else {
                    result[i] = heights[i] + heights.length;
                }
            }

            return result;
        }
    }

}