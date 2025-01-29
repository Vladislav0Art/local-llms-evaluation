package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedNext {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next() {
        int price = 3;
        int result = onlineStockSpan.next(price);
        assertEquals(1, result); // coverage: max line coverage of the method with different prices
    }

}