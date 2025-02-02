package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_MultiplePricesTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_MultiplePricesTest() {
        onlineStockSpan.next(30);
        onlineStockSpan.next(3);
        onlineStockSpan.next(5);

        assertEquals(2, (long) onlineStockSpan.list.get(0));
    }

}