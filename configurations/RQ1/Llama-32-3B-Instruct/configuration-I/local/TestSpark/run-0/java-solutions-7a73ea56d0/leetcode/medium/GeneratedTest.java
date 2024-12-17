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
public class GeneratedTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();
    @Mock
    private List<Integer> mockList;

    public void setMockList(List<Integer> mockList) {
        this.mockList = mockList;
    }

    @Test
    public void next_Price_EmptyStack_ReturnsZero() {
        // arrange
        stockSpan.list = mockList;

        // act
        int result = stockSpan.next(1);
        assertEquals(0, result);
    }

    @Test
    public void next_Price_LowerThanAllPreviousAddToStackAndReturnOne() throws Exception {
        // arrange
        stockSpan.list = mockList;
        mockList.add(5);

        // act
        int result = stockSpan.next(1);
        assertEquals(1, result);
    }

    @Test
    public void next_Price_LowerThanSomePreviousAddToStackAndReturnDifference() throws Exception {
        // arrange
        stockSpan.list = mockList;
        mockList.add(5);
        mockList.add(3);

        // act
        int result = stockSpan.next(2);
        assertEquals(1, result);
    }

    @Test
    public void next_Price_GreaterThanAllPreviousAddToStack() {
        stockSpan.list = mockList;
        mockList.add(5);
        mockList.add(3);
        mockList.add(4);

        int result = stockSpan.next(6);
        assertNull(result);
    }

    @Test
    public void calculateSpans_PriceArray_EmptyReturnEmptyArray() {
        // arrange
        int[] prices = new int[0];
        when(stockSpan.prices).thenReturn(prices);

        // act
        int[] result = stockSpan.calculateSpans(prices);

        // assert
        assertNull(result);
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

    @Test
    public void calculateSpans_PriceArray_MultipleElementsReturnCorrectSpans() {
        // arrange
        when(stockSpan.list).thenReturn(mockList);
        mockList.add(10);
        mockList.add(5);
        mockList.add(8);
        stockSpan.list = mockList;
        when(stockSpan.prices).thenReturn(new int[]{10, 5, 8});

        // act
        int[] result = stockSpan.calculateSpans(prices);

        // assert
        assertEquals(new int[]{1, 4, 2}, result);
    }

}