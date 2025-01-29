package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestKeep {

    @Test
    public void testKeep() {
        // Test keeping all rows based on a condition
        DataFrame df = new DataFrame("Column1", "Column2");

        boolean result = df.keepColumns(null);
        assertEquals(false, result);

        result = df.keepColumns(new String[]{"Column1"});
        assertEquals(0, result);
    }

}