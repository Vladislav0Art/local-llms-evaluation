package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDrop {

    @Test
    public void testDrop() {
        // Test dropping all rows based on a condition
        DataFrame df = new DataFrame("Column1", "Column2");

        boolean result = df.dropColumns(null);
        assertEquals(false, result);

        result = df.dropColumns(new String[]{"Column1"});
        assertEquals(0, result);
    }

}