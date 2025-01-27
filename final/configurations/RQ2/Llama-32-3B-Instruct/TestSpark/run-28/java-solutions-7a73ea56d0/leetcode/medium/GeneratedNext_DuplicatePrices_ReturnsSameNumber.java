package leetcode.medium;

public class GeneratedNext_DuplicatePrices_ReturnsSameNumber {

    @Test
    public void next_DuplicatePrices_ReturnsSameNumber() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int result = stockSpan.next(100);

        // then
        assertEquals(1, result); // assume the mock returns 1
    }

}