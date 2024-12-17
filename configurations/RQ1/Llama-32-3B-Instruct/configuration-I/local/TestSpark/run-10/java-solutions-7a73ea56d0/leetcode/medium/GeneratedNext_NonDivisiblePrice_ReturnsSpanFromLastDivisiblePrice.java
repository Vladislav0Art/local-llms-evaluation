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
public class GeneratedNext_NonDivisiblePrice_ReturnsSpanFromLastDivisiblePrice {

    private List<Integer> list = new ArrayList<>();
    @Spy
    private OnlineStockSpan onlineStockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public void tearDown() {
    }

    @Test
    public void next_NonDivisiblePrice_ReturnsSpanFromLastDivisiblePrice() {
        list.add(1);
        list.add(2);
        when(onlineStockSpan.indexStack()).thenReturn(list.size() - 1);

        int result = onlineStockSpan.next(2);
        assertEquals(1, result);
    }

}