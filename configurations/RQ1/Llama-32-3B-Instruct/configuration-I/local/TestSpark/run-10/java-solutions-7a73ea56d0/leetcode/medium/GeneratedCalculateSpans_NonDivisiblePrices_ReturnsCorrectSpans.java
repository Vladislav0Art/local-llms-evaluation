package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedCalculateSpans_NonDivisiblePrices_ReturnsCorrectSpans {

    private List<Integer> list = new ArrayList<>();
    @Spy
    private OnlineStockSpan onlineStockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public void tearDown() {
    }

    @Test
    public void calculateSpans_NonDivisiblePrices_ReturnsCorrectSpans() {
        list.add(10);
        list.add(20);
        list.add(30);
        when(onlineStockSpan.indexStack()).thenReturn(list.size() - 1);

        int[] result = onlineStockSpan.calculateSpans(new int[]{20, 10, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

}