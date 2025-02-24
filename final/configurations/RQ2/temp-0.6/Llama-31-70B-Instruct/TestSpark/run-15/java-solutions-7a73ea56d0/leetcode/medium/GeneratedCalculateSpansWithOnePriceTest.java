package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansWithOnePriceTest {

    @Test
    public void calculateSpansWithOnePriceTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] result = obj.calculateSpans(new int[]{100});
        assertEquals(Arrays.asList(1), Arrays.asList(result));
    }

}