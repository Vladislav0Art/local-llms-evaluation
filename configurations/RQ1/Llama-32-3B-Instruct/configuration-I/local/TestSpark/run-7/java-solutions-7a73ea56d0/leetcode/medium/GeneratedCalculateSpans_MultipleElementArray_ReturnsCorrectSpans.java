package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_MultipleElementArray_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementArray_ReturnsCorrectSpans() {
        // Given
        int[] prices = {10, 20, 15};
        List<Integer> list = new ArrayList<>();
        stack();
        int[] expectedSpans = {1, 2, 2};

        Mockito.when(indexStack.peek()).thenReturn(0);
        Mockito.when(indexStack.pop()).thenReturn(0);

        // When
        int[] actualSpans = stockSpan.calculateSpans(prices);

        // Then
        for (int i = 0; i < expectedSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

    public static void stack() {
        Mockito.when(indexStack.isEmpty()).thenReturn(false);
        Mockito.when(indexStack.peek()).thenReturn(2);
        Mockito.when(indexStack.pop()).thenReturn(0);
        Mockito.when(indexStack.push(1)).thenReturn(null);
    }

    public static Class<?>[] verifyNoMoreInteractions(List<Integer> list, Stack stack) {
        return new Class[]{list, stack};
    }

}