package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestNext_EqualTo {

    @Test
    public void testNext_EqualTo() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(100);
        s.next(100);
        s.next(100);
        assertEquals(3, s.next(100));
        assertEquals(2, s.next(90));
    }

}