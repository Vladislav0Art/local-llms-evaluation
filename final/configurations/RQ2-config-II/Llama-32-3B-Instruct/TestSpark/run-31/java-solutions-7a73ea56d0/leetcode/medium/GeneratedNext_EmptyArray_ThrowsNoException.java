package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNext_EmptyArray_ThrowsNoException {

    @Test
    public void next_EmptyArray_ThrowsNoException() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertFalse(solution.next(new int[0]).hasNext());
    }

}