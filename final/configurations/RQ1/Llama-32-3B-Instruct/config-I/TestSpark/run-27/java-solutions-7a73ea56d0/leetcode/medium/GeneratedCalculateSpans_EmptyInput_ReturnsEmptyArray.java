package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyInput_ReturnsEmptyArray {

    @Mock
    private java.util.Stack<Integer> indexStack;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        // Given
        when(indexStack.isEmpty()).thenReturn(true);

        // When
        int[] result = OnlineStockSpan.calculateSpans(new int[0], indexStack);

        // Then
        assertResultIsEmpty(result);
    }

}