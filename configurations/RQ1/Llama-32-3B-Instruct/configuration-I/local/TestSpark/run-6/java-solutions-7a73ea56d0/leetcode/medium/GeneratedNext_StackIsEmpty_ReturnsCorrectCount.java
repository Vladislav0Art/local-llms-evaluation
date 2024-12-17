package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_StackIsEmpty_ReturnsCorrectCount {

    @Test
    public void next_StackIsEmpty_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int price = 150;
        assertEquals(1, stockSpan.next(price));
    }

}