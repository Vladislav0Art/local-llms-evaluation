package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertTrue(result.length == 0);
    }

}