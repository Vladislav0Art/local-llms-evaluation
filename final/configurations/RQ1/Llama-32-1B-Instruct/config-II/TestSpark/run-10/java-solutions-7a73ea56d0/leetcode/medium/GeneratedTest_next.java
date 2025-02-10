package leetcode.medium;

public class GeneratedTest_next {

    @Test
    public void test_next() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 3;
        int result = instance.next(price);
        assert result == 1;

        price = 4;
        result = instance.next(price);
        assert result == 2;
    }

}