package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyArrayTest {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_EmptyArrayTest() {
        onlineStockSpan = new OnlineStockSpan();
        assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(new int[]{}));
    }

}