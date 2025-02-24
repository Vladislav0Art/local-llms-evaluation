package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<Integer> mockPriceList;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void nextTest() {
        int price = 10;
        int expected = 1;

        assertEquals(expected, onlineStockSpan.next(price));
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 20, 30};
        int[] expected = {1, 1, 1};

        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansEmptyPricesTest() {
        int[] prices = {};
        int[] expected = {};

        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansNullPricesTest() {
        int[] prices = null;
        int[] expected = null;

        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}