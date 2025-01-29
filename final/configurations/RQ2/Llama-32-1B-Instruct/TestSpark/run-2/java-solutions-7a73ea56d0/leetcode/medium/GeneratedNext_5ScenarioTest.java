package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_5ScenarioTest {

    @Mock
    private OnlineStockSpan instance;

    @Test
    public void next_5ScenarioTest() {
        // Arrange
        int price = 10;
        Mockito.when(instance.next(prices[0])).thenReturn(1);

        // Act
        int result = instance.next(price);
        Mockito.verifyNoMoreInteractions(instance, prices[0]);

        assertEquals(2, result);
    }

}