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
public class GeneratedCalculateSpans_StackIsNotEmpty_ReturnsCorrectIndex {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_StackIsNotEmpty_ReturnsCorrectIndex() {
        // given
        int[] prices = {10, 20};
        when(indexStack.peek()).thenReturn(1);
        when(indexStack.isEmpty()).thenReturn(false);

        // when
        int[] result = onlineStockSpan.calculateSpans(prices);

        // then
        assertTrue(result.length == 2);
        assertEquals(0, result[0]);
        assertEquals(19, result[1]);
    }

}