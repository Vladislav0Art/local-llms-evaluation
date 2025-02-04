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
public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

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
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}