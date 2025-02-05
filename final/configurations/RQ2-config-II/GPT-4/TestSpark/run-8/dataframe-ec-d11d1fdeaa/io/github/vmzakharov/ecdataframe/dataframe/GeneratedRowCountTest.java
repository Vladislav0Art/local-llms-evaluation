package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame df = new DataFrame("testDF");
        df.addStringColumn("testColumn");

        int rowsCountBefore = df.rowCount();
        df.addRow();
        int rowsCountAfter = df.rowCount();

        assertEquals(0, rowsCountBefore);
        assertEquals(1, rowsCountAfter);
    }

}