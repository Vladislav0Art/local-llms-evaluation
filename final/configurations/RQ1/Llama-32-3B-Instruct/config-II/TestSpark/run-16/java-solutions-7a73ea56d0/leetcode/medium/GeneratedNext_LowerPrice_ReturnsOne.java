package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_LowerPrice_ReturnsOne {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_LowerPrice_ReturnsOne() {
        assertEquals(1, stockSpan.next(5));
    }

}