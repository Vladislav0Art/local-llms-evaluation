package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestNext_LessThan {

    @Test
    public void testNext_LessThan() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(100);
        s.next(80);
        s.next(70);
        s.next(60);
        assertEquals(1, s.next(65));
        assertEquals(2, s.next(70));
    }

}