package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_4ScenarioTest {

    @Mock
    private OnlineStockSpan instance;

    @Test
    public void calculateSpans_4ScenarioTest() {
        // Arrange
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.calculateSpans(Mockito.anyInt())).thenReturn(new int[]{1});

        // Act
        int[] prices = {10, 9};
        int result = instance.calculateSpans(prices);
        Mockito.verifyNoMoreInteractions(instance, prices);

        assertEquals(2, result[0]);
    }

}