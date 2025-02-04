package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_PriceIsLessThanFirstPrice {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next_PriceIsLessThanFirstPrice() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(5);
        stockSpan.next(4);
        assertEquals(2, list.get(0));
    }

}