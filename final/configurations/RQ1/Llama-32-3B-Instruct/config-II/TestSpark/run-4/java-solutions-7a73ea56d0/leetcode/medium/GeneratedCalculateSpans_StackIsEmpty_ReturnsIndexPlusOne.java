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
public class GeneratedCalculateSpans_StackIsEmpty_ReturnsIndexPlusOne {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_StackIsEmpty_ReturnsIndexPlusOne() {
        // given
        int[] prices = {};
        when(indexStack.isEmpty()).thenReturn(true);

        // when
        int[] result = onlineStockSpan.calculateSpans(prices);

        // then
        assertTrue(result.length == 0);
    }

}