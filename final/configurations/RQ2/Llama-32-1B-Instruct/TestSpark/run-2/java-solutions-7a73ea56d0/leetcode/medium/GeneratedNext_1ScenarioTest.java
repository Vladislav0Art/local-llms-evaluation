package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_1ScenarioTest {

    @Mock
    private OnlineStockSpan instance;

    @Test
    public void next_1ScenarioTest() {
        // Arrange
        int price = 10;
        Mockito.when(instance.next(price)).thenReturn(1);

        // Act
        int result = instance.next(price);
        Mockito.verify(instance).next(price);

        assertEquals(2, result);
    }

}