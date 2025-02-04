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
public class GeneratedCalculateSpans_SinglePriceElement_ReturnsSingleElementArray {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SinglePriceElement_ReturnsSingleElementArray() {
        // given
        int[] prices = {10};

        // when
        int[] result = onlineStockSpan.calculateSpans(prices);

        // then
        assertTrue(result.length == 1);
        assertEquals(1, result[0]);
    }

}