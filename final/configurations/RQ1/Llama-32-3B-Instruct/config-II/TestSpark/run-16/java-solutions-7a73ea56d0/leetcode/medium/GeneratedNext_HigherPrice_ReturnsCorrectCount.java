package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_HigherPrice_ReturnsCorrectCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_HigherPrice_ReturnsCorrectCount() {
        assertEquals(2, stockSpan.next(15)); // [10, 11, 12] span: 3
    }

}