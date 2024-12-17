package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_PriceGreaterOrEqualToPreviousPrices_ReturnsCorrectCount {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_PriceGreaterOrEqualToPreviousPrices_ReturnsCorrectCount() {
        Stack<Integer> indexStack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        indexStack.push(0);
        list.add(50);

        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);

        onlineStockSpan.list = list;
        onlineStockSpan.indexStack = indexStack;

        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}