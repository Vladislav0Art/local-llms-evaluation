package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_IncreasingPrices_ReturnsCorrectSpans {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_IncreasingPrices_ReturnsCorrectSpans() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}