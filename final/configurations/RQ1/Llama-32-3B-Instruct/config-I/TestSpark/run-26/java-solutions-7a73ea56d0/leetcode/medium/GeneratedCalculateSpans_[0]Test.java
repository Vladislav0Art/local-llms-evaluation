package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_[0]

Test {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    @Test
    public void calculateSpans_[ 0]Test() {
        int[] prices = new int[1];
        prices[0] = 10;
        when(list.size()).thenReturn(0);
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}