package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextTest {

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

}