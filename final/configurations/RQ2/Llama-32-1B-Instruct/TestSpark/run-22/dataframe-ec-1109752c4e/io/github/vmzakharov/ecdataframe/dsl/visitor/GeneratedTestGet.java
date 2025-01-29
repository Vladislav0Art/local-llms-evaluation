package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGet {

    public String get(String col) {
        return "Column " + col;
    }

    public int add(int row, int value) {
        return row + value;
    }
}

class DataFrameTest {

    @Test
    public void testGet() {
        DataFrame df = new DataFrame();
        assertEquals("Column A", df.get("A"));
        assertEquals("Column B", df.get("B"));
    }

}