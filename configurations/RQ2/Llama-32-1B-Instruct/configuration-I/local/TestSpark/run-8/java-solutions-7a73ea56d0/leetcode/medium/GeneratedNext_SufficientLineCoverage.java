package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedNext_SufficientLineCoverage {

    @Test
    public void next_SufficientLineCoverage() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 10;
        int actual = stock.next(price);
        assertEquals(3, actual);
    }

}