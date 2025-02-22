package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(5));
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = Mockito.spy(OnlineStockSpan.class);
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = {1, 1, 1, 2, 1, 4, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(Arrays.asList(expectedSpans), Arrays.asList(actualSpans));
    }

}