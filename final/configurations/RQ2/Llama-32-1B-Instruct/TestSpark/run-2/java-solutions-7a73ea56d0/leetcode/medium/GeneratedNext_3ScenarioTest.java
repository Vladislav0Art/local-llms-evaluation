package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_3ScenarioTest {

    @Mock
    private OnlineStockSpan instance;

    @Test
    public void next_3ScenarioTest() {
        // Arrange
        int price = 10;
        Mockito.when(instance.next(price)).thenReturn(1);
        Mockito.when(instance.next(prices[0])).thenReturn(2);
        Mockito.when(instance.next(prices[1])).thenReturn(3);

        // Act
        int result = instance.next(prices[0]);
        result = instance.next(result);
        result = instance.next(result);
        Mockito.verify(instance).next(price);
        Mockito.verify(instance).next(prices[0]);
        Mockito.verify(instance).next(prices[1]);

        assertEquals(5, result);
    }

}