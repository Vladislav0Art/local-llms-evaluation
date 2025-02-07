package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_0_Series_Returns_0 {

    private OnlineStockSpan subject = new OnlineStockSpan();

    @Test
    public void testNext_0_Series_Returns_0() {
        int[] prices = {10, 6};
        when(subject.next(10)).thenReturn(1);
        when(subject.next(6)).thenReturn(3);
        result = subject.next(6);
        Mockito.verify(subject).next(Mockito.eq(6));
    }

}