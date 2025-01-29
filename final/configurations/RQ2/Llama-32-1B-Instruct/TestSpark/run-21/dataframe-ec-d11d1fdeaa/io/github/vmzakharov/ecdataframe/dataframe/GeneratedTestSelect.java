package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSelect {

    @Test
    public void testSelect() {
        // Test selecting all rows based on a condition
        DataFrame df = new DataFrame("Column1", "Column2");

        boolean result = df.selectBy("Column1 > 0");
        assertEquals(true, result);

        result = df.selectBy(null);
        assertEquals(false, result);
    }

}