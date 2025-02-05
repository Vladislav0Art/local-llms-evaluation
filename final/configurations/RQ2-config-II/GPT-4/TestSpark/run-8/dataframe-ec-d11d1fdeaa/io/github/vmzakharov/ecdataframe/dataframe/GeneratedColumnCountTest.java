package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("testDF");

        int columnCountBefore = df.columnCount();
        df.addStringColumn("testColumn");
        int columnCountAfter = df.columnCount();

        assertEquals(0, columnCountBefore);
        assertEquals(1, columnCountAfter);
    }

}