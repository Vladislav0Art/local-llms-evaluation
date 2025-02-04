package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_NullPrice_ThrowsNullPointerException {

    @Test
    public void next_NullPrice_ThrowsNullPointerException() {
        OnlineStockSpan obj = new OnlineStockSpan();
        assertThrows(NullPointerException.class, () -> obj.next(null));
    }

}