package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAdd {

    public String get(String col) {
        return "Column " + col;
    }

    public int add(int row, int value) {
        return row + value;
    }
}

class DataFrameTest {

    @Test
    public void testAdd() {
        DataFrame df = new DataFrame();
        int row = 1;
        assertEquals(6, df.add(row, 5));
        assertEquals(5, df.add(row, 3));
    }
}

}