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
public class GeneratedCalculateSpans_SamePrice_ReturnsCorrectSpans {

    @Mock
    private List<Integer> list;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_SamePrice_ReturnsCorrectSpans() {
        List<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(80);
        when(list.size()).thenReturn(prices.size());
        when(list.get(anyInt())).thenReturn(0);

        onlineStockSpan.list = list;
        int[] actual = onlineStockSpan.calculateSpans(prices.toCharArray());
        for (int i = 1; i < actual.length; i++) {
            assertEquals(i, actual[i]);
        }
    }

}