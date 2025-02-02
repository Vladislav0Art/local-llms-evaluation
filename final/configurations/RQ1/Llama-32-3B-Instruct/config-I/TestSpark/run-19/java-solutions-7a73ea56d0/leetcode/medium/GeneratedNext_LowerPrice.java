package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedNext_LowerPrice {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void next_LowerPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        instance.list.add(5);
        instance.list.add(3);
        assertEquals(2, instance.next(3));
    }

}