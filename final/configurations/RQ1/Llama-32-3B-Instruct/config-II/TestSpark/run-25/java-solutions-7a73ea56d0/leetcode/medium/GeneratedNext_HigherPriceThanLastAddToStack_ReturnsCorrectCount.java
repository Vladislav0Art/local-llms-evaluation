package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_HigherPriceThanLastAddToStack_ReturnsCorrectCount {

    @Test
    public void next_HigherPriceThanLastAddToStack_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(90);
        assertEquals(3, stockSpan.next(90));
    }

}