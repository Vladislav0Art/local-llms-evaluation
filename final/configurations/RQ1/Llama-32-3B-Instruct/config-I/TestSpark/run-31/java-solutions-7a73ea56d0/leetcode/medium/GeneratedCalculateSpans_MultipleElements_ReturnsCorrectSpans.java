package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    private List<Integer> list = new ArrayList<>();

    public OnlineStockSpan getOnlineStockSpan() {
        return new OnlineStockSpan();
    }

    public int[] calculateSpans(int[] prices) {
        return getOnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, -1, -3, -4, -5};
        int[] spans = calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 2, 1, 2}, spans);
    }

}