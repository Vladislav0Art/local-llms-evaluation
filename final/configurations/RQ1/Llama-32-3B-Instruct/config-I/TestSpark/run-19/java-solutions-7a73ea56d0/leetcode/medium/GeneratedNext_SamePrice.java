package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedNext_SamePrice {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next_SamePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        instance.list.add(10);
        instance.list.add(10);
        assertEquals(1, instance.next(10));
    }

}