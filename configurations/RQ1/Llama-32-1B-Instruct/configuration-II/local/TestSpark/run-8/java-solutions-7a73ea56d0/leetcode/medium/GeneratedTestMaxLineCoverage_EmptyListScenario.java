package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestMaxLineCoverage_EmptyListScenario {

    private OnlineStockSpan onlineStockSpan;

    @BeforeEach
    public void init() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_EmptyListScenario() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(100);
        onlineStockSpan.calculateSpans(new int[]{});

        assertEquals(0, onlineStockSpan.list.size());
    }

}