package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_PushIndexToStack {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_PushIndexToStack() {
        // given
        int[] prices = {10};
        when(indexStack.isEmpty()).thenReturn(true);

        onlineStockSpan.list.add(10);
        onlineStockSpan.next(10);
        onlineStockSpan.calculateSpans(prices);

        verify(indexStack, times(1)).push(eq(0));
    }

}