package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_NoDecreasingSequence_ReturnsCorrectSpans {

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    public void initMocks() {
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        when(indexStack.push(anyInt())).thenReturn(indexStack);
        when(list.add(anyInt())).thenReturn(list);
    }

    @Test
    public void calculateSpans_NoDecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 40, 30, 60, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}