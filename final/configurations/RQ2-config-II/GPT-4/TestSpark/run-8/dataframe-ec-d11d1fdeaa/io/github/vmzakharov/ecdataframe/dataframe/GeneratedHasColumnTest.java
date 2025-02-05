package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedHasColumnTest {

    @Test
    public void hasColumnTest() {
        DataFrame df = new DataFrame("testDF");

        boolean hasColumnBefore = df.hasColumn("testColumn");
        df.addStringColumn("testColumn");
        boolean hasColumnAfter = df.hasColumn("testColumn");

        assertFalse(hasColumnBefore);
        assertTrue(hasColumnAfter);
    }

}