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
public class GeneratedCalculateSpans_EmptyPricesArray_ReturnsCorrectSpans {

    private List<Integer> list = new ArrayList<>();
    @Spy
    private OnlineStockSpan onlineStockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public void tearDown() {
    }

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsCorrectSpans() {
        list.add(10);
        when(onlineStockSpan.indexStack()).thenReturn(true);

        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertEquals(new int[]{1}, result);
    }

}