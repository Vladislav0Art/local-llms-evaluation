package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectResult {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectResult() {
        OnlineStockSpan underTest = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}