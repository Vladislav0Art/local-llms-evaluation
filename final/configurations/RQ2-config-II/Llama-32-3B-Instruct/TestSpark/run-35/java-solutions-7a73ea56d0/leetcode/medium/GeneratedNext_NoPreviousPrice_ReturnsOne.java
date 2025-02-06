package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_NoPreviousPrice_ReturnsOne {

    @Test
    public void next_NoPreviousPrice_ReturnsOne() {
        int price = 10;
        int result = OnlineStockSpan.next(price);
        assertEquals(1, result);
    }

}