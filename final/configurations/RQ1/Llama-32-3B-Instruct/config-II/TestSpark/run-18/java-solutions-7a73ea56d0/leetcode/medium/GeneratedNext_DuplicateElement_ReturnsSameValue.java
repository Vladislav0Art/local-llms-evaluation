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
public class GeneratedNext_DuplicateElement_ReturnsSameValue {

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
    public void next_DuplicateElement_ReturnsSameValue() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        int price = 10;
        onlineStockSpan.next(price);
        onlineStockSpan.next(price);
        assertEquals(1, onlineStockSpan.list.get(0));
    }

}