package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] result = obj.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        assertEquals(Arrays.asList(1, 1, 1, 2, 1, 4, 6), Arrays.asList(result));
    }

}