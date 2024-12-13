package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsOne {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1
        }

    }