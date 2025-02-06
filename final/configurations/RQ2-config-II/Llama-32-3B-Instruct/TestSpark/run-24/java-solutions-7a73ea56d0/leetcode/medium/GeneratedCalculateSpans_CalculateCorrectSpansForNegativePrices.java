package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCalculateSpans_CalculateCorrectSpansForNegativePrices {

    @Test
    public void calculateSpans_CalculateCorrectSpansForNegativePrices() {
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        List<Integer> prices = Arrays.asList(-1000, -5, 10);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(3, result[0]);
        assertEquals(2, result[1]);
    }

}