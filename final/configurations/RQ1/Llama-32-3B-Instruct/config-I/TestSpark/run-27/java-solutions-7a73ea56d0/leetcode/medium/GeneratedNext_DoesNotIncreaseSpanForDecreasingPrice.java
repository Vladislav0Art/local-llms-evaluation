package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_DoesNotIncreaseSpanForDecreasingPrice {

    @Mock
    private java.util.Stack<Integer> indexStack;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void next_DoesNotIncreaseSpanForDecreasingPrice() {
        // Given
        int[] prices = {100, 80, 75};
        for (int price : prices) {
            when(indexStack.isEmpty()).thenReturn(true);
        }
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list.clear();
        for (int i = 0; i < prices.length - 1; i++) {
            onlineStockSpan.next(prices[i]);
        }

        // When
        int actual = onlineStockSpan.next(prices[prices.length - 2]);

        // Then
        assertEquals(1, actual);
    }

}