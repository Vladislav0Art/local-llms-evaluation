package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIndexAdd {

    public String get(String col) {
        return "Column " + col;
    }

    public int add(int row, int value) {
        return row + value;
    }
}

class DataFrameTest {

    @Test
    public void testIndexAdd() {
        DataFrame df = new DataFrame();
        int[] values = {1, 2};
        for (int value : values) {
            DataFrame row = new DataFrame();
            row.add(0, value);
            Index index = row.getIndex("A");
            assertSame(row, index);
            index.add(value * 2, value);
            assertEquals(4, index.get(0));
        }
    }

}