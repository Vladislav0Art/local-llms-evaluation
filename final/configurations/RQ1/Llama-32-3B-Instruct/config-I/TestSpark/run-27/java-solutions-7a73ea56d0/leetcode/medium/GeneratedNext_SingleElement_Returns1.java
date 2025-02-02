package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_SingleElement_Returns1 {

    @Mock
    private java.util.Stack<Integer> indexStack;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void next_SingleElement_Returns1() {
        // Given
        int price = 100;
        when(indexStack.isEmpty()).thenReturn(true);

        // When
        int actual = OnlineStockSpan.next(price, indexStack);

        // Then
        assertEquals(1, actual);
    }

}