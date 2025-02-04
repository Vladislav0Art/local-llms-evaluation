package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_LowerPrice_ReturnsCountOfHigherPrices {

    @Test
    public void next_LowerPrice_ReturnsCountOfHigherPrices() {
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.list.add(80);
        obj.list.add(70);
        obj.next(60);
        int result = obj.next(70);
        assertEquals(2, result);
    }

}