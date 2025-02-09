package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextSequencePricesTest {

    @Test
    public void nextSequencePricesTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int span1 = spanner.next(100);
        int span2 = spanner.next(80);
        int span3 = spanner.next(60);
        int span4 = spanner.next(70);
        int span5 = spanner.next(60);
        int span6 = spanner.next(75);
        int span7 = spanner.next(85);

        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 2, 4}, new int[]{span1, span2, span3, span4, span5, span6, span7});
    }

}