package leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestNext_noPrice {

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,3,5"
    })
    void testNext_givenPrice_givenResult(int price, int expectedResult) {
        return new OnlineStockSpan().next(price);
    }

    public int next(int price) {
        if (price == 0) {
            return 0;
        } else if (price < 1) {
            return 1;
        } else {
            return price + Math.min(next(price - 1), next(price - 2));
        }
    }

    @Test
    public void testNext_noPrice() {
        return next(-1);
    }

}