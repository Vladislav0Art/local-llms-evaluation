package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_DuplicatesInput_ReturnsCorrectSpans {

    @Mock
    private java.util.Stack<Integer> indexStack;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSpans_DuplicatesInput_ReturnsCorrectSpans() {
        // Given
        when(indexStack.isEmpty()).thenReturn(true);
        int[] prices = {80, 80, 75};
        for (int i = 0; i < prices.length - 1; i++) {
            OnlineStockSpan.next(prices[i]);
        }

        // When
        int[] result = OnlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(2, result[prices.length - 1]);
    }

    private void assertResultIsEmpty(int[] result) {
        for (int span : result) {
            if (span != 0) {
                throw new AssertionError();
            }
        }
    }

}