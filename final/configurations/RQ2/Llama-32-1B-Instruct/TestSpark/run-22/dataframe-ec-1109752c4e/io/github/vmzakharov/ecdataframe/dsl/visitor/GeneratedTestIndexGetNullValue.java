package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIndexGetNullValue {

    public String get(String col) {
        return "Column " + col;
    }

    public int add(int row, int value) {
        return row + value;
    }
}

class DataFrameTest {

    @Test
    public void testIndexGetNullValue() {
        DataFrame df = new DataFrame();
        Index index = df.getIndex("A");
        assertEquals(null, index.get(-1));
    }

}