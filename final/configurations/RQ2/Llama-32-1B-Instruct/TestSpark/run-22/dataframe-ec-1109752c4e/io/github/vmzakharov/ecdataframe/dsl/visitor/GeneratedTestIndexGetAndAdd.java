package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIndexGetAndAdd {

    public String get(String col) {
        return "Column " + col;
    }

    public int add(int row, int value) {
        return row + value;
    }
}

class DataFrameTest {

    @Test
    public void testIndexGetAndAdd() {
        DataFrame df = new DataFrame();
        Index index1 = df.getIndex("A");
        int[] values1 = {1, 2};
        for (int value : values1) {
            df.add(0, value);
            Index index2 = df.getIndex("A");
            assertSame(df, index2);
            index2.add(value * 2, value);
            assertEquals(4, index2.get(0));
        }
    }

}