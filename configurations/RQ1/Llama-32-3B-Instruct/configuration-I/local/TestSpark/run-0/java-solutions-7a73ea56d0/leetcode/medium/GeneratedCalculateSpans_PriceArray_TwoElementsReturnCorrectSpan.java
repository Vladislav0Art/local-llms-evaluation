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
public class GeneratedCalculateSpans_PriceArray_TwoElementsReturnCorrectSpan {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();
    @Mock
    private List<Integer> mockList;

    public void setMockList(List<Integer> mockList) {
        this.mockList = mockList;
    }

    @Test
    public void calculateSpans_PriceArray_TwoElementsReturnCorrectSpan() {
        // arrange
        when(stockSpan.list).thenReturn(mockList);
        mockList.add(10);
        mockList.add(5);
        stockSpan.list = mockList;
        when(stockSpan.prices).thenReturn(new int[]{10, 5});

        // act
        int[] result = stockSpan.calculateSpans(prices);

        // assert
        assertEquals(new int[]{1, 4}, result);
    }

}