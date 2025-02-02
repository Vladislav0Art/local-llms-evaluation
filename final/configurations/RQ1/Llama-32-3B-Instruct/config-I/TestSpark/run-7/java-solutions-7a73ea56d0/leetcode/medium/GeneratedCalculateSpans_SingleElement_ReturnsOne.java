package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElement_ReturnsOne {

    @Mock
    private List<Integer> list;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    public void setup() {
        onlineStockSpan.list = Mockito.mock(list);
    }

    @Test
    public void calculateSpans_SingleElement_ReturnsOne() {
        setup();
        int[] prices = new int[]{100};
        onlineStockSpan.list.add(prices[0]);
        int[] result = onlineStockSpan.calculateSpans(prices);
        Mockito.verify(list).add(Mockito.anyInt());
        Mockito.when(list.get(0)).thenReturn(100);
        Mockito.assertExactValue(new int[]{1}, result);
    }

}