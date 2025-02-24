package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansWithTwoPricesTest {

    @Test
    public void calculateSpansWithTwoPricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] result = obj.calculateSpans(new int[]{100, 80});
        assertEquals(Arrays.asList(1, 1), Arrays.asList(result));
    }

}