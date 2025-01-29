package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_1ScenarioTest {

    @Mock
    private OnlineStockSpan instance;

    @Test
    public void calculateSpans_1ScenarioTest() {
        // Arrange
        int[] prices = {3, 5, 8, 9};
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.calculateSpans(prices)).thenReturn(new int[]{0, 2});

        // Act
        int result = instance.calculateSpans(prices);
        Mockito.verify(instance).calculateSpans(Mockito.anyInt());

        assertEquals(3, result[0]);
    }

}