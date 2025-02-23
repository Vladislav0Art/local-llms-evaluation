package leetcode.medium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_WhenPricesAreGiven_ReturnsCorrectSpans {

    private OnlineStockSpan stock;
    private int[] prices;

    @Before
    public void setUp() {
        stock = new OnlineStockSpan();
        prices = new int[]{10, 20, 30, 40};
    }

    @Test
    public void calculateSpans_WhenPricesAreGiven_ReturnsCorrectSpans() {
        assertArrayEquals(new int[]{1, 2, 3, 4
        }

    }