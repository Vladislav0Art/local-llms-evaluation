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
public class GeneratedNext_DivisiblePrice_ReturnsSpanOfAllPreviousPrices {

    private List<Integer> list = new ArrayList<>();
    @Spy
    private OnlineStockSpan onlineStockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public void tearDown() {
    }

    @Test
    public void next_DivisiblePrice_ReturnsSpanOfAllPreviousPrices() {
        list.add(1);
        when(onlineStockSpan.indexStack()).thenReturn(true);

        int result = onlineStockSpan.next(1);
        assertEquals(0, result);
    }

}