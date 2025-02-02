package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNext_MockForNext_HappyPathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_MockForNext_HappyPathTest() {
        when(stockSpan.list.get(0)).thenReturn(100);
        assertEquals(1, stockSpan.next(50));
        verify(stockSpan).list.add(50);
        verify(stockSpan).next(40);
        verify(stockSpan).list.add(40);
        verify(stockSpan).next(30);
        verify(stockSpan).list.add(30);
        verify(stockSpan).next(20);
        verify(stockSpan).list.add(20);
        verify(stockSpan).next(10);
        verify(stockSpan).list.add(10);
        verify(stockSpan).next(5);
    }

}