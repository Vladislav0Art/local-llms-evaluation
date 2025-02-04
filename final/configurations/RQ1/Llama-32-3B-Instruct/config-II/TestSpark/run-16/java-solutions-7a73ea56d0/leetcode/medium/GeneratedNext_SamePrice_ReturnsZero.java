package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_SamePrice_ReturnsZero {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_SamePrice_ReturnsZero() {
        assertEquals(0, stockSpan.next(10));
    }

}