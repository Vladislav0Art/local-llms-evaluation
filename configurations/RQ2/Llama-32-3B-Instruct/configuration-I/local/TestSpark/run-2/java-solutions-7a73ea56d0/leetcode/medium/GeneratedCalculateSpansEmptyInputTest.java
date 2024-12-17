package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansEmptyInputTest {

    @Mock
    private int[] pricesArray;

    @Mock
    private int price;

    public OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @org.junit.BeforeClass
    public static void setUpClass() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @org.junit.AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void calculateSpansEmptyInputTest() {
        Mockito.when(pricesArray.length).thenReturn(0);
        int[] expectedResult = {};
        int[] actualResult = onlineStockSpan.calculateSpans(pricesArray);
        assertArrayEquals(expectedResult, actualResult);
    }

}