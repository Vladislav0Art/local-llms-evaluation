package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

public class GeneratedTestNext_GivenPriceZero_ReturnsOne {

    private int count = 0;

    public int[] next(int price) {
        count++;
        return new int[]{count};
    }

    public int[] calculateSpans(int[] heights) {
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

public class OnlineStockSpanTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNext_GivenPriceZero_ReturnsOne() {
        int[] result = stockSpan.next(0);
        assertEquals(new int[]{1}, result);
    }

}