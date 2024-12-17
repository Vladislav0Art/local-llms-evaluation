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
public class GeneratedCalculateSpans_EmptyPricesArray_ReturnsEmptyArray {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsEmptyArray() {
        // Given
        int[] prices = new int[0];

        // When
        int[] actualSpans = stockSpan.calculateSpans(prices);

        // Then
        assertTrue(actualSpans.length == 0);
    }

}