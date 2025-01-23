package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[0], result);
    }

}