package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_PricesAreEqual_ReturnsCount {

    @Test
    public void next_PricesAreEqual_ReturnsCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int price = 100;
        assertEquals(1, stockSpan.next(price));
    }

}