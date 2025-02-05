package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("testDF");

        DataFrame result = df.addStringColumn("testColumn");

        assertNotNull(result);
        assertNotNull(result.getColumnNamed("testColumn"));
        assertEquals("testColumn", result.getColumnNamed("testColumn").getName());
        assertNotNull(result.getColumnNamed("testColumn").getStore());
    }

}