package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_WithZeroPrice_ReturnsOne {

    @Before
    public void setup() {
        // Do nothing as per the requirements
    }

    @Test
    public void next_WithZeroPrice_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(0));
    }

}