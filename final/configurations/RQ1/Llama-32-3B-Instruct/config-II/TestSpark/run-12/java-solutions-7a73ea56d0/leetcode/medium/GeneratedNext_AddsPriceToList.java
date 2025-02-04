package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_AddsPriceToList {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next_AddsPriceToList() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(1, list.size());
    }

}