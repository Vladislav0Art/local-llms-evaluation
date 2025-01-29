package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIndexGet {

    public String get(String col) {
        return "Column " + col;
    }

    public int add(int row, int value) {
        return row + value;
    }
}

class DataFrameTest {

    @Test
    public void testIndexGet() {
        DataFrame df = new DataFrame();
        Index index = df.getIndex("A");
        assertSame(df, index);
        index.add(0, 1);
        assertEquals(2, index.get(0));
    }

}