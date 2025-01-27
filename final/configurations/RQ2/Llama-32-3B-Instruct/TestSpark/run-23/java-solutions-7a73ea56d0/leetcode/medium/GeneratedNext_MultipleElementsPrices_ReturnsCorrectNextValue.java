package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedNext_MultipleElementsPrices_ReturnsCorrectNextValue {

    @Test
    public void next_MultipleElementsPrices_ReturnsCorrectNextValue() {
        OnlineStackSpan onlineStackSpan = new OnlineStackSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStackSpan.next(price);
        }
        assertEquals(6, onlineStackSpan.next(4));
    }

}