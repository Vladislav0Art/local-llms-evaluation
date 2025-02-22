package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void nextTest() {
        // Arrange
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // Act
        int actual = stockSpan.next(10);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    public void calculateSpansTest() {
        // Arrange
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 3, 2, 4};
        int[] expected = new int[]{1, 2, 1, 4};

        // Act
        int[] actual = stockSpan.calculateSpans(prices);

        // Assert
        assertArrayEquals(expected, actual);
    }

}