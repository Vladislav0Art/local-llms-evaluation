package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansNonEmptyArrayTest {

    @Test
    public void calculateSpansNonEmptyArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}