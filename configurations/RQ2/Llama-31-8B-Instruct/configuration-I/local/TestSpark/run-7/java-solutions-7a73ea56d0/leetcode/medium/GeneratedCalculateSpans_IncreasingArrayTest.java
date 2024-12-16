package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_IncreasingArrayTest {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_IncreasingArrayTest() {
        onlineStockSpan = new OnlineStockSpan();
        assertArrayEquals(new int[]{1, 1, 2, 3, 4}, onlineStockSpan.calculateSpans(new int[]{10, 7, 20, 15, 30}));
    }

}