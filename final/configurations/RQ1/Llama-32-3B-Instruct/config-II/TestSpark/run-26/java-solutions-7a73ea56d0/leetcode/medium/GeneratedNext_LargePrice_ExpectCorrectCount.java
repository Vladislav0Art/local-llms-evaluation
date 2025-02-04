package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_LargePrice_ExpectCorrectCount {

    @Test
    public void next_LargePrice_ExpectCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10000; i++) {
            onlineStockSpan.next(10);
        }
        assertEquals(1, onlineStockSpan.list.size());
    }

}