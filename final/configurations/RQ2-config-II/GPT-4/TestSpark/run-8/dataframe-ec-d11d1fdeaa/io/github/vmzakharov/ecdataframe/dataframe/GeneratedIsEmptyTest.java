package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("testDF");
        df.addStringColumn("testColumn");

        boolean isEmptyBefore = df.isEmpty();
        df.addRow(Arrays.asList(new String[]{"abc"}));
        boolean isEmptyAfter = df.isEmpty();

        assertTrue(isEmptyBefore);
        assertFalse(isEmptyAfter);
    }

}