package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_LowPriceFromLeft_ReturnsCorrectSpan {

    @Mock
    private List<Integer> list;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    public void setup() {
        onlineStockSpan.list = Mockito.mock(list);
    }

    @Test
    public void calculateSpans_LowPriceFromLeft_ReturnsCorrectSpan() {
        setup();
        int[] prices = new int[]{75, 50, 100};
        onlineStockSpan.list.add(prices[0]);
        onlineStockSpan.next(prices[1]);
        onlineStockSpan.next(prices[2]);
        int[] result = onlineStockSpan.calculateSpans(prices);
        Mockito.verify(list).add(Mockito.anyInt());
        Mockito.when(list.get(0)).thenReturn(75);
        Mockito.when(list.get(1)).thenReturn(50);
        Mockito.when(list.get(2)).thenReturn(100);
        Mockito.assertExactValue(new int[]{3, 4, 2}, result);
    }

}