package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_PricesAreNotEqual_ReturnsCorrectCount {

    @Test
    public void next_PricesAreNotEqual_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int price1 = 100;
        int price2 = 150;
        assertEquals(3, stockSpan.next(price1));
    }

}