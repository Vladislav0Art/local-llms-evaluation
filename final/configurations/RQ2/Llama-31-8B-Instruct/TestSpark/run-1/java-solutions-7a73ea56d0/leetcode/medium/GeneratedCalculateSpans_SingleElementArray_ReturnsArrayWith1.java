package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsArrayWith1 {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_SingleElementArray_ReturnsArrayWith1() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}