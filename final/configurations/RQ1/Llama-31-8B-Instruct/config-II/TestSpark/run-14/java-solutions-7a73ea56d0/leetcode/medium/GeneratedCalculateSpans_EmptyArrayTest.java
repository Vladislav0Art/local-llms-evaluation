package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyArrayTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_EmptyArrayTest() {
        int[] prices = {};
        int[] expected = {};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}