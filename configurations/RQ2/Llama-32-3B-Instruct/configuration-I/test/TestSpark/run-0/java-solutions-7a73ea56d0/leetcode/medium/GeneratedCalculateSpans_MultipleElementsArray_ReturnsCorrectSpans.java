package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 1, 4, 5, 6}, result);
    }

}