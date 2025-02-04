package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_LowerPriceThanFirstAddToStack_AddToStackAndReturnCount {

    @Test
    public void next_LowerPriceThanFirstAddToStack_AddToStackAndReturnCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(90);
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(100));
    }

}