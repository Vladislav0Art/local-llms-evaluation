package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_2ScenarioTest {

    @Mock
    private OnlineStockSpan instance;

    @Test
    public void calculateSpans_2ScenarioTest() {
        // Arrange
        int[] prices = new int[]{3, 5};
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.calculateSpans(prices)).thenReturn(new int[]{1});

        // Act
        int result = instance.calculateSpans(prices);
        Mockito.verifyNoMoreInteractions(instance, prices);

        assertEquals(2, result[0]);
    }

}