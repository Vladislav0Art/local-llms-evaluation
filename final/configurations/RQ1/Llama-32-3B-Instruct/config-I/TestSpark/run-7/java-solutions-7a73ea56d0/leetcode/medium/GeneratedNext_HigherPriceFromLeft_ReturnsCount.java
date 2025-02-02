package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_HigherPriceFromLeft_ReturnsCount {

    @Mock
    private List<Integer> list;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    public void setup() {
        onlineStockSpan.list = Mockito.mock(list);
    }

    @Test
    public void next_HigherPriceFromLeft_ReturnsCount() {
        setup();
        onlineStockSpan.list.add(75);
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(75);
        Mockito.verify(list).add(Mockito.anyInt());
        Mockito.when(list.get(Mockito.anyInt())).thenReturn(75);
        Mockito.assertExactValue(2, result);
    }

}