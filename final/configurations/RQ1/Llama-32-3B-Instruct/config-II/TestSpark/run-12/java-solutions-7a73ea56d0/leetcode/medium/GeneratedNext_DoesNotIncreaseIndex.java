package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DoesNotIncreaseIndex {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next_DoesNotIncreaseIndex() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(0, stockSpan.list.get(1));
    }

}