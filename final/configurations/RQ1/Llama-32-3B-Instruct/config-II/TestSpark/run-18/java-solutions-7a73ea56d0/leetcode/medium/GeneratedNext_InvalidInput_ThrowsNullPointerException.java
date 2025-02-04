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
public class GeneratedNext_InvalidInput_ThrowsNullPointerException {

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
    public void next_InvalidInput_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        int price = null;
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(price));
    }

}