package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestNext_GreaterThan {

    @Test
    public void testNext_GreaterThan() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(10);
        s.next(20);
        s.next(30);
        assertEquals(0, s.next(40));
        assertEquals(1, s.next(50));
    }

}