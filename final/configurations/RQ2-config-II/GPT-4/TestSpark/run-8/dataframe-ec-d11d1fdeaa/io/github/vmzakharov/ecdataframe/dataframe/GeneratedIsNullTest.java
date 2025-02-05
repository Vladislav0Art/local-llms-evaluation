package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedIsNullTest {

    @Test
    public void isNullTest() {
        DataFrame df = new DataFrame("testDF");
        df.addStringColumn("testColumn");

        boolean isNullBefore = df.isNull("testColumn", 0);
        df.addRow(Arrays.asList(new String[]{"abc"}));
        boolean isNullAfter = df.isNull("testColumn", 0);

        assertTrue(isNullBefore);
        assertFalse(isNullAfter);
    }

}