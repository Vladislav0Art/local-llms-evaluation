package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nextTest() {
        // Arrange
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int inputPrice = 10;
        int expectedResult = 1;

        // Act
        int actualResult = stockSpan.next(inputPrice);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSpansTest() {
        // Arrange
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] inputPrices = new int[]{1, 2, 3, 4, 5};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        // Act
        int[] actualResult = stockSpan.calculateSpans(inputPrices);

        // Assert
        assertEquals(expectedResult.length, actualResult.length);
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], actualResult[i]);
        }
    }

}