package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_DecreasingPrices_ReturnsCorrectSpans {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_DecreasingPrices_ReturnsCorrectSpans() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{50, 40, 30, 20, 10});
        assertArrayEquals(new int[]{5, 4, 3, 2, 1
        }

    }