package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_ReturnsCorrectSpans {

    @Mock
    private Stack<Integer> stack;

    public int[] calculateSpans(int[] prices) {
        return new OnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

}