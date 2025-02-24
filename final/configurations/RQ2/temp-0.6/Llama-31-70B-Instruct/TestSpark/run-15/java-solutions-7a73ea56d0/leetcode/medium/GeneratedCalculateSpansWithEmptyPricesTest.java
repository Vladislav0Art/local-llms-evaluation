package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansWithEmptyPricesTest {

    @Test
    public void calculateSpansWithEmptyPricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] result = obj.calculateSpans(new int[]{});
        assertEquals(Arrays.asList(), Arrays.asList(result));
    }

}