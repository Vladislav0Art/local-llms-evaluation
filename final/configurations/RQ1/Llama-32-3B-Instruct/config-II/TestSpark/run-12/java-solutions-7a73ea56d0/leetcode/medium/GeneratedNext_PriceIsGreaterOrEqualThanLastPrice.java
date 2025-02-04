package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_PriceIsGreaterOrEqualThanLastPrice {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next_PriceIsGreaterOrEqualThanLastPrice() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(8);
        assertTrue(stockSpan.list.get(0) == 9);
    }

}