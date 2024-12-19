package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextPriceNegativeTest {

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
    public void nextPriceNegativeTest() {
        Mockito.when(pricesArray[0]).thenReturn(-10);
        int result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

}