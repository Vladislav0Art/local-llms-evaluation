package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElement_ReturnsSpanOne {

    @Mock
    private List<Integer> list;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_SingleElement_ReturnsSpanOne() {
        List<Integer> prices = new ArrayList<>();
        prices.add(100);
        when(list.size()).thenReturn(prices.size());
        when(list.get(anyInt())).thenReturn(0);

        onlineStockSpan.list = list;
        int[] actual = onlineStockSpan.calculateSpans(prices.toCharArray());
        assertEquals(1, actual[0]);
    }

}