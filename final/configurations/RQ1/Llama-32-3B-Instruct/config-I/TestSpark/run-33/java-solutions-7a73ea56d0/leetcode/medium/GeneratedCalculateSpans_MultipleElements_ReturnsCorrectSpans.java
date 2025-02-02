package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 5, 6, 4, 3, 2, 1});
        assert result[0] == 1;
        assert result[1] == 1;
        assert result[2] == 2;
        assert result[3] == 2;
        assert result[4] == 3;
        assert result[5] == 3;
        assert result[6] == 4;
    }

}