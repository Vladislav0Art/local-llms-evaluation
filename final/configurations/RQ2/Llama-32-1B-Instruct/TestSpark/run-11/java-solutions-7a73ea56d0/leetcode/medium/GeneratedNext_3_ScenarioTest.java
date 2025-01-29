package leetcode.medium;

public class GeneratedNext_3_ScenarioTest {

    @Test
    public void next_3_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 10;
        int[] result = stock.next(price);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Mock
    private int[] prices;

    public void next_4_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 1, 2});
    }

    public void next_5_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 1});
    }

    public void next_6_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 2});
    }

    public void next_7_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 3});
    }

    public void next_8_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 4});
    }

    public void next_9_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 5});
    }

    public void next_10_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        StockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next_1_ScenarioTest();
        stock.next(10);
        when(stock.calculateSpans(prices)).thenReturn(new int[]{0, 6});
    }

}