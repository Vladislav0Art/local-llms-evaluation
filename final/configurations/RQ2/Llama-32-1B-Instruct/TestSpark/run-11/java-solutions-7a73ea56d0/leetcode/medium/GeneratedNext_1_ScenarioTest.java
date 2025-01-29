package leetcode.medium;

public class GeneratedNext_1_ScenarioTest {

    @Test
    public void next_1_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 3;
        int[] result = stock.next(price);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

}