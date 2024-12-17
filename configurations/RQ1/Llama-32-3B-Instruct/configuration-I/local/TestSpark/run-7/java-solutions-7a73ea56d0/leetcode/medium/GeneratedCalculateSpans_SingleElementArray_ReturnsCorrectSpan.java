package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        // Given
        int[] prices = {10};
        int expectedSpan = 1;

        // When
        int[] actualSpans = stockSpan.calculateSpans(prices);

        // Then
        assertEquals(expectedSpan, actualSpans[0]);
    }

}