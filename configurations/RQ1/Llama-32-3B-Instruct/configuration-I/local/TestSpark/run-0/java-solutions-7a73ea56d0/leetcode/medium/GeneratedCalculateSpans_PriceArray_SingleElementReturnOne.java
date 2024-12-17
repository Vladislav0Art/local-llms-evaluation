package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_PriceArray_SingleElementReturnOne {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();
    @Mock
    private List<Integer> mockList;

    public void setMockList(List<Integer> mockList) {
        this.mockList = mockList;
    }

    @Test
    public void calculateSpans_PriceArray_SingleElementReturnOne() {
        // arrange
        int[] prices = {10};
        when(stockSpan.prices).thenReturn(prices);

        // act
        int[] result = stockSpan.calculateSpans(prices);

        // assert
        assertEquals(new int[]{1}, result);
    }

}