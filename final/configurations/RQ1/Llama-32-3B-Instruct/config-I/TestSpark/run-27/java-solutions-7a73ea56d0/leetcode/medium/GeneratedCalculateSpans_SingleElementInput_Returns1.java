package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementInput_Returns1 {

    @Mock
    private java.util.Stack<Integer> indexStack;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSpans_SingleElementInput_Returns1() {
        // Given
        when(indexStack.isEmpty()).thenReturn(true);

        // When
        int[] result = OnlineStockSpan.calculateSpans(new int[]{100}, indexStack);

        // Then
        assertEquals(1, result[0]);
    }

}