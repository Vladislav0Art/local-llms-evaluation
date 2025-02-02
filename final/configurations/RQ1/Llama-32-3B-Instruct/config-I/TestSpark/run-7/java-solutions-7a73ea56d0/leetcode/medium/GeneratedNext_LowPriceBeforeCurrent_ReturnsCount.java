package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_LowPriceBeforeCurrent_ReturnsCount {

    @Mock
    private List<Integer> list;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    public void setup() {
        onlineStockSpan.list = Mockito.mock(list);
    }

    @Test
    public void next_LowPriceBeforeCurrent_ReturnsCount() {
        setup();
        onlineStockSpan.list.add(50);
        onlineStockSpan.next(75);
        int result = onlineStockSpan.next(50);
        Mockito.verify(list).add(Mockito.anyInt());
        Mockito.when(list.get(Mockito.anyInt())).thenReturn(50);
        Mockito.assertExactValue(2, result);
    }

}