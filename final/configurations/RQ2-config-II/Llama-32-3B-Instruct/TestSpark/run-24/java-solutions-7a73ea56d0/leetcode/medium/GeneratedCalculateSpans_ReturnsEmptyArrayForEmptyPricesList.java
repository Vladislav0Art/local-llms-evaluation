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
public class GeneratedCalculateSpans_ReturnsEmptyArrayForEmptyPricesList {

    @Test
    public void calculateSpans_ReturnsEmptyArrayForEmptyPricesList() {
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        List<Integer> prices = new ArrayList<>();
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, result);
    }

}