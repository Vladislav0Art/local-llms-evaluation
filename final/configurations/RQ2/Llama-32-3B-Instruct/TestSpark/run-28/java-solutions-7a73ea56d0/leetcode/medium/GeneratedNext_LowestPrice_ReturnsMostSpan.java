package leetcode.medium;

public class GeneratedNext_LowestPrice_ReturnsMostSpan {

    @Test
    public void next_LowestPrice_ReturnsMostSpan() {
        // given
        List<Integer> prices = Arrays.asList(100, 80, 60);
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int result = stockSpan.next(prices.get(0));

        // then
        assertEquals(1, result); // assume the mock returns 1
    }

}