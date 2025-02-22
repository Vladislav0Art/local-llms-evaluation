package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        // Arrange
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // Act
        int actual = stockSpan.next(10);

        // Assert
        assertEquals(1, actual);
    }

}