package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_StackClear {

    @Test
    public void next_StackClear() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i = 0; i < 100; i++) {
            stockSpan.next(i);
        }
        assertTrue(stockSpan.list.isEmpty());
    }

}