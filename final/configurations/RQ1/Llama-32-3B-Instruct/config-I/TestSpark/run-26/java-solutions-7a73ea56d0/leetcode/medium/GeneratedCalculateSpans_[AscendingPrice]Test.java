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
public class GeneratedCalculateSpans_[AscendingPrice]

Test {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    @Test
    public void calculateSpans_[ AscendingPrice]Test() {
        int[] prices = new int[]{10, 7, 2};
        when(list).thenReturn(new ArrayList<>(underTest.list));
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        when(indexStack.push(anyInt())).thenAnswer((i) -> i);
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1, 3, 4}, result);
    }

}